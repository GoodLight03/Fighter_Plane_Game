package com.example.game;

import static com.example.game.GameView.screenRatioX;
import static com.example.game.GameView.screenRatioY;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class FlightAM {
    public int speed = 2; // Tốc độ
    public boolean wasShot = true; // Bị bắn
    int x = 0, y, width, height, birdCounter = 1; //Dài, Rộng, Số Chim
    Bitmap fl1; // Ảnh chim

    // KHỞI TẠO
    FlightAM(Resources res) {
        //Tạo các đối tượng Bitmap từ nhiều nguồn khác nhau, bao gồm tệp, luồng và mảng byte.
        fl1 = BitmapFactory.decodeResource(res, R.drawable.fly3);


        //Lấy chiều rộng, chiều cao
        width = fl1.getWidth();
        height = fl1.getHeight();

        //Chia nhỏ chiều rộng chiều cao
        width /= 15;
        height /= 15;

        //Nhân với tỷ lệ màn hình ở gameview
        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        //Tạo một bitmap mới, được chia tỷ lệ từ bitmap hiện có, khi có thể.
        fl1 = Bitmap.createScaledBitmap(fl1, width, height, false);


        //???
        y = -height;
    }

    // LẤY ĐỐI TƯỢNG
    Bitmap getFlightAM () {


        birdCounter = 1;

        return fl1;
    }


    //-> Hình dạng va chạm
    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}
