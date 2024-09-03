package com.example.game;

import static com.example.game.GameView.screenRatioX;
import static com.example.game.GameView.screenRatioY;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import java.util.Random;

public class Obstacle {
    public int speed = 2; // Tốc độ
    int x =0, y, width, height;
    Bitmap ob; // Ảnh chim

    // KHỞI TẠO
    Obstacle(Resources res) {
        //Tạo các đối tượng Bitmap từ nhiều nguồn khác nhau, bao gồm tệp, luồng và mảng byte.
        ob = BitmapFactory.decodeResource(res, R.drawable.obstacle);


        //Lấy chiều rộng, chiều cao
        width = ob.getWidth();
        height = ob.getHeight();

        //Chia nhỏ chiều rộng chiều cao
        width /= 15;
        height /= 15;

        //Nhân với tỷ lệ màn hình ở gameview
        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        //Tạo một bitmap mới, được chia tỷ lệ từ bitmap hiện có, khi có thể.
        ob = Bitmap.createScaledBitmap(ob, width, height, false);


        //???
        y = -height;
    }

    // LẤY ĐỐI TƯỢNG
    Bitmap getObstacle () {

        return ob;
    }


    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }
}
