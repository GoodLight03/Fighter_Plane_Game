package com.example.game;

public class Credit {
//    private void Doc(){
//        /*
//        Phương thức Draw
//1.drawColor(int color): Vẽ một màu sắc duy nhất trên toàn bộ Canvas.
//2.drawPaint(Paint paint): Vẽ một Paint đã được cấu hình trên toàn bộ Canvas.
//3.drawRect(float left, float top, float right, float bottom, Paint paint): Vẽ hình chữ nhật bằng cách chỉ định tọa độ của các cạnh.
//4.drawCircle(float cx, float cy, float radius, Paint paint): Vẽ hình tròn bằng cách chỉ định tâm và bán kính.
//cx: Tọa độ x của tâm hình tròn.
//cy: Tọa độ y của tâm hình tròn.
//radius: Bán kính của hình tròn.
//paint: Đối tượng Paint được sử dụng để cài đặt các thuộc tính vẽ như màu sắc, độ dày, kiểu vẽ, v.v.
//
//5.drawLine(float startX, float startY, float stopX, float stopY, Paint paint): Vẽ đường thẳng bằng cách chỉ định tọa độ điểm đầu và điểm cuối.
//startX: Tọa độ x của điểm đầu đường thẳng.
//startY: Tọa độ y của điểm đầu đường thẳng.
//stopX: Tọa độ x của điểm cuối đường thẳng.
//stopY: Tọa độ y của điểm cuối đường thẳng.
//paint: Đối tượng Paint được sử dụng để cài đặt các thuộc tính vẽ như màu sắc, độ dày, kiểu vẽ, v.v.
//
//6.drawPath(Path path, Paint paint): Vẽ một đường cong Path đã được xác định trước.
//path: Đối tượng Path mô tả đường path (đường cong) cần vẽ.
//paint: Đối tượng Paint được sử dụng để cài đặt các thuộc tính vẽ như màu sắc, độ dày, kiểu vẽ, v.v.
//Dưới đây là một ví dụ minh họa về cách sử dụng phương thức drawPath() để vẽ một đường cong trên Canvas:
//java
//Copier
//@Overrideprotected void onDraw(Canvas canvas) {    super.onDraw(canvas);    Path path = new Path();    path.moveTo(50f, 50f); // Di chuyển đến điểm (50, 50)    path.lineTo(200f, 200f); // Vẽ đường thẳng đến điểm (200, 200)    path.quadTo(300f, 100f, 400f, 200f); // Vẽ đường cong quadratic Bézier đến điểm (400, 200)    path.cubicTo(500f, 300f, 600f, 200f, 700f, 400f); // Vẽ đường cong cubic Bézier đến điểm (700, 400)    path.close(); // Đóng đường path    Paint paint = new Paint();    paint.setColor(Color.RED); // Màu sắc của đường path    paint.setStyle(Paint.Style.STROKE); // Kiểu vẽ là nét đứt
//    canvas.drawPath(path, paint);
//}
//
//7.drawText(String text, float x, float y, Paint paint): Vẽ văn bản tại vị trí xác định bằng tọa độ x và y.
//8.drawBitmap(Bitmap bitmap, float left, float top, Paint paint): Vẽ một hình ảnh bitmap tại vị trí xác định.
//9.drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint): Vẽ một cung tròn bằng cách chỉ định RectF chứa cung, góc bắt đầu, góc quét và sử dụng điểm trung tâm hay không.
//10.drawOval(RectF oval, Paint paint): Vẽ một hình oval bằng cách chỉ định RectF chứa hình oval.
//11.drawRoundRect(RectF rect, float rx, float ry, Paint paint): Vẽ một hình chữ nhật với các góc được làm tròn bằng cách chỉ định RectF, bán kính x và y cho các góc được làm tròn.
//12.drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint): Vẽ văn bản trên một đường cong Path với một khoảng cách ngang và dọc được xác định.
//1.Thuộc tính setColor(int color): Đặt màu sắc cho vùng vẽ.
//2.setAlpha(int alpha): Đặt độ trong suốt của vùng vẽ.
//3.setStyle(Style style): Đặt kiểu vẽ, ví dụ như FILL (đổ màu), STROKE (viền), hoặc FILL_AND_STROKE (đổ màu và viền).
//4.setStrokeWidth(float width): Đặt độ dày của viền khi sử dụng kiểu vẽ STROKE.
//5.setAntiAlias(boolean aa): Bật/tắt chế độ chống răng cưa để làm mịn các đường vẽ.
//6.setShader(Shader shader): Đặt đối tượng Shader để tạo hiệu ứng màu sắc hoặc gradient cho vùng vẽ.
//7.setXfermode(Xfermode xfermode): Đặt chế độ xử lý độ che lớp khi vẽ trên vùng đã có nội dung.
//8.setTextSize(float textSize): Đặt kích thước của văn bản khi sử dụng phương thức drawText.
//9.setTypeface(Typeface typeface): Đặt kiểu phông chữ của văn bản khi sử dụng phương thức drawText.
//10.setTextAlign(Paint.Align align): Đặt căn chỉnh văn bản, ví dụ như LEFT, CENTER, hoặc RIGHT.
//11.setShadowLayer(float radius, float dx, float dy, int shadowColor): Đặt hiệu ứng bóng cho vùng vẽ.
//12.setPathEffect(PathEffect effect): Đặt hiệu ứng đặc biệt cho đường vẽ, ví dụ như DashPathEffect để tạo hiệu ứng đường gạch đứt.
//13.setTextStyle(int style): Đặt kiểu phong cách cho văn bản, ví dụ như BOLD, ITALIC, hoặc BOLD_ITALIC.
//14.setTextScaleX(float scaleX): Đặt tỉ lệ thu phóng ngang cho văn bản.
//15.setMaskFilter(MaskFilter maskfilter): Đặt bộ lọc mặt nạ cho vùng vẽ.
//
//Dưới đây là một số phương thức quan trọng trong lớp Paint trong Android:
//1.setARGB(int a, int r, int g, int b): Đặt giá trị màu sắc dựa trên các thành phần alpha, red, green và blue.
//2.setColor(int color): Đặt màu sắc cho Paint.
//3.setAlpha(int alpha): Đặt độ trong suốt của Paint.
//4.setStyle(Paint.Style style): Đặt kiểu vẽ, ví dụ như FILL, STROKE hoặc FILL_AND_STROKE.
//5.setStrokeWidth(float width): Đặt độ dày của viền khi sử dụng kiểu vẽ STROKE.
//6.setAntiAlias(boolean aa): Bật/tắt chế độ chống răng cưa để làm mịn các đường vẽ.
//7.setShader(Shader shader): Đặt đối tượng Shader để tạo hiệu ứng màu sắc hoặc gradient cho vùng vẽ.
//8.setXfermode(Xfermode xfermode): Đặt chế độ xử lý độ che lớp khi vẽ trên vùng đã có nội dung.
//9.setTextSize(float textSize): Đặt kích thước của văn bản khi sử dụng phương thức drawText.
//10.setTypeface(Typeface typeface): Đặt kiểu phông chữ của văn bản khi sử dụng phương thức drawText.
//11.setTextAlign(Paint.Align align): Đặt căn chỉnh văn bản, ví dụ như LEFT, CENTER hoặc RIGHT.
//12.setShadowLayer(float radius, float dx, float dy, int shadowColor): Đặt hiệu ứng bóng cho vùng vẽ.
//13.setPathEffect(PathEffect effect): Đặt hiệu ứng đặc biệt cho đường vẽ, ví dụ như DashPathEffect để tạo hiệu ứng đường gạch đứt.
//14.setTextStyle(int style): Đặt kiểu phong cách cho văn bản, ví dụ như BOLD, ITALIC hoặc BOLD_ITALIC.
//15.setTextScaleX(float scaleX): Đặt tỉ lệ thu phóng ngang cho văn bản.
//16.setMaskFilter(MaskFilter maskfilter): Đặt bộ lọc mặt nạ cho vùng vẽ.
//17.setFilterBitmap(boolean filter): Bật/tắt chế độ lọc bitmap để làm mịn hình ảnh khi vẽ.
//18.setUnderlineText(boolean underline): Bật/tắt chế độ gạch chân văn bản.
//19.setStrikeThruText(boolean strikeThru): Bật/tắt chế độ gạch ngang văn bản.
//20.measureText(String text): Đo chiều rộng của văn bản được truyền vào.
//21.getTextBounds(String text, int start, int end, Rect bounds): Đo kích thước của văn bản và lưu kết quả vào đối tượng Rect.
//22.getTextWidths(String text, float[] widths): Lấy các chiều rộng của từng ký tự trong văn bản và lưu vào mảng widths.
//23.ascent(): Trả về giá trị cao nhất của các ký tự trong phạm vi vẽ.
//24.descent(): Trả về giá trị thấp nhất của các ký tự trong phạm vi vẽ.
//25.setLetterSpacing(float letterSpacing): Đặt khoảng cách giữa các ký tự trong văn bản.
//26.getFontMetrics(FontMetrics metrics): Lấy thông tin về các giá trị liên quan đến font như chiều cao,Dưới đây là một số phương pháp quan trọng trong lớp Paint trong Android:
//27.setARGB(int a, int r, int g, int b): Đặt giá trị màu sắc dựa trên các thành phần alpha, red, green và blue.
//28.setColor(int color): Đặt màu sắc cho Paint.
//29.setAlpha(int alpha): Đặt độ trong suốt của Paint.
//30.setStyle(Paint.Style style): Đặt kiểu vẽ, ví dụ: FILL, STROKE hoặc FILL_AND_STROKE.
//31.setStrokeWidth(float width): Đặt độ dày của nét vẽ khi sử dụng kiểu STROKE.
//32.setAntiAlias(boolean aa): Bật/tắt chế độ chống răng cưa để làm mịn các đường vẽ.
//33.setShader(Shader shader): Đặt đối tượng Shader để tạo hiệu ứng màu sắc hoặc gradient cho vùng vẽ.
//34.setXfermode(Xfermode xfermode): Đặt chế độ xử lý độ che lớp khi vẽ trên vùng đã có nội dung.
//35.setTextSize(float textSize): Đặt kích thước của văn bản khi sử dụng phương thức drawText.
//36.setTypeface(Typeface typeface): Đặt kiểu phông chữ của văn bản khi sử dụng phương thức drawText.
//37.setTextAlign(Paint.Align align): Đặt căn chỉnh văn bản, ví dụ: LEFT, CENTER hoặc RIGHT.
//38.setShadowLayer(float radius, float dx, float dy, int shadowColor): Đặt hiệu ứng bóng cho vùng vẽ.
//39.setPathEffect(PathEffect effect): Đặt hiệu ứng đặc biệt cho đường vẽ, ví dụ: DashPathEffect để tạo hiệu ứng đường gạch đứt.
//40.setTextStyle(int style): Đặt kiểu phong cách cho văn bản, ví dụ: BOLD, ITALIC hoặc BOLD_ITALIC.
//41.setTextScaleX(float scaleX): Đặt tỉ lệ thu phóng ngang cho văn bản.
//42.setMaskFilter(MaskFilter maskfilter): Đặt bộ lọc mặt nạ cho vùng vẽ.
//43.setFilterBitmap(boolean filter): Bật/tắt chế độ lọc bitmap để làm mịn hình ảnh khi vẽ.
//44.setUnderlineText(boolean underline): Bật/tắt chế độ gạch chân văn bản.
//45.setStrikeThruText(boolean strikeThru): Bật/tắt chế độ gạch ngang văn bản.
//46.measureText(String text): Đo chiều rộng của văn bản được truyền vào.
//47.getTextBounds(String text, int start, int end, Rect bounds): Đo kích thước của văn bản và lưu kết quả vào đối tượng Rect.
//48.getTextWidths(String text, float[] widths): Lấy các chiều rộng của từng ký tự trong văn bản và lưu vào mảng widths.
//49.ascent(): Trả về giá trị cao nhất của các ký tự trong phạm vi vẽ.
//50.descent(): Trả về giá trị thấp nhất của các ký tự trong phạm vi vẽ.
//51.setLetterSpacing(float letterSpacing): Đặt khoảng cách giữa các ký tự trong văn bản.
//52.getFontMetrics(FontMetrics metrics): Lấy thông tin về các giá trị liên quan đến font như chiều cao baseline, ascent,
//
//Dưới đây là một số thuộc tính quan trọng của lớp Paint trong Android:
//1.color: Màu sắc của Paint.
//2.alpha: Độ trong suốt của Paint.
//3.style: Kiểu vẽ, ví dụ: FILL, STROKE hoặc FILL_AND_STROKE.
//4.strokeWidth: Độ dày của nét vẽ khi sử dụng kiểu STROKE.
//5.antiAlias: Chế độ chống răng cưa để làm mịn các đường vẽ.
//6.shader: Đối tượng Shader để tạo hiệu ứng màu sắc hoặc gradient cho vùng vẽ.
//7.xfermode: Chế độ xử lý độ che lớp khi vẽ trên vùng đã có nội dung.
//8.textSize: Kích thước của văn bản khi sử dụng phương thức drawText.
//9.typeface: Kiểu phông chữ của văn bản khi sử dụng phương thức drawText.
//10.textAlign: Căn chỉnh văn bản, ví dụ: LEFT, CENTER hoặc RIGHT.
//11.textScaleX: Tỉ lệ thu phóng ngang cho văn bản.
//12.textSkewX: Góc nghiêng văn bản.
//13.shadowLayer: Hiệu ứng bóng cho vùng vẽ.
//14.pathEffect: Hiệu ứng đặc biệt cho đường vẽ, ví dụ: DashPathEffect để tạo hiệu ứng đường gạch đứt.
//15.maskFilter: Bộ lọc mặt nạ cho vùng vẽ.
//16.filterBitmap: Chế độ lọc bitmap để làm mịn hình ảnh khi vẽ.
//17.underlineText: Chế độ gạch chân văn bản.
//18.strikeThruText: Chế độ gạch ngang văn bản.
//19.letterSpacing: Khoảng cách giữa các ký tự trong văn bản.
//20.fakeBoldText: Chế độ văn bản đậm giả tạo.
//21.textSkewX: Góc nghiêng văn bản.
//22.hinting: Chế độ gợi ý cho văn bản.
//23.subpixelText: Chế độ hiển thị văn bản chính xác hơn trên màn hình LCD.
//24.linearText: Chế độ hiển thị văn bản dọc.
//25.verticalText: Chế độ hiển thị văn bản theo chiều dọc.
//26.fontFeatureSettings: Cài đặt tính năng phông chữ.
//27.hintingMode: Chế độ gợi ý cho văn bản.
//28.textLocale: Ngôn ngữ cho văn bản.
//29.fontVariationSettings: Cài đặt biến thể phông chữ.
//30.isElegantTextHeight: Chế độ chiều cao văn bản tinh tế.
//31.isVerticalText: Chế độ văn bản theo chiều dọc.
//32.baselineShift: Dịch chuyển baseline của văn bản.
//33.isSubpixelText: Chế độ hiển thị văn bản chính xác hơn trên màn hình LCD.
//34.hintingMode: Chế độ gợi ý cho văn bản.
//35.fontVariationSettings: Cài đặt biến thể phông chữ.
//36.textLocale: Ngôn ngữ cho văn bản.
//37.linkColor: Màu sắc của liên kết văn bản.
//38.isElegantTextHeight: Chế độ chiều cao văn bản tinh tế.
//39.isVerticalText: ChếXin lỗi, nhưng có vẻ như một số thông tin bị trùng lặp và không liên quan đến thuộc tính của lớp Paint. Dưới đây là 50 thuộc tính quan trọng của lớp Paint trong Android:
//40.color: Màu sắc của Paint.
//41.alpha: Độ trong suốt của Paint.
//42.style: Kiểu vẽ, ví dụ: FILL, STROKE hoặc FILL_AND_STROKE.
//43.strokeWidth: Độ dày của nét vẽ khi sử dụng kiểu STROKE.
//44.antiAlias: Chế độ chống răng cưa để làm mịn các đường vẽ.
//45.shader: Đối tượng Shader để tạo hiệu ứng màu sắc hoặc gradient cho vùng vẽ.
//46.xfermode: Chế độ xử lý độ che lớp khi vẽ trên vùng đã có nội dung.
//47.textSize: Kích thước của văn bản khi sử dụng phương thức drawText.
//48.typeface: Kiểu phông chữ của văn bản khi sử dụng phương thức drawText.
//49.textAlign: Căn chỉnh văn bản, ví dụ: LEFT, CENTER hoặc RIGHT.
//50.textScaleX: Tỉ lệ thu phóng ngang cho văn bản.
//51.textSkewX: Góc nghiêng văn bản.
//52.shadowLayer: Hiệu ứng bóng cho vùng vẽ.
//53.pathEffect: Hiệu ứng đặc biệt cho đường vẽ, ví dụ: DashPathEffect để tạo hiệu ứng đường gạch đứt.
//54.maskFilter: Bộ lọc mặt nạ cho vùng vẽ.
//55.filterBitmap: Chế độ lọc bitmap để làm mịn hình ảnh khi vẽ.
//56.underlineText: Chế độ gạch chân văn bản.
//57.strikeThruText: Chế độ gạch ngang văn bản.
//58.letterSpacing: Khoảng cách giữa các ký tự trong văn bản.
//59.fakeBoldText: Chế độ văn bản đậm giả tạo.
//60.hinting: Chế độ gợi ý cho văn bản.
//61.subpixelText: Chế độ hiển thị văn bản chính xác hơn trên màn hình LCD.
//62.linearText: Chế độ hiển thị văn bản dọc.
//63.verticalText: Chế độ hiển thị văn bản theo chiều dọc.
//64.fontFeatureSettings: Cài đặt tính năng phông chữ.
//65.baselineShift: Dịch chuyển baseline của văn bản.
//66.linkColor: Màu sắc của liên kết văn bản.
//67.isElegantTextHeight: Chế độ chiều cao văn bản tinh tế.
//68.hintingMode: Chế độ gợi ý cho văn bản.
//69.textLocale: Ngôn ngữ cho văn bản.
//70.fontVariationSettings: Cài đặt biến thể phông chữ.
//71.isVerticalText: Chế độ văn bản theo chiều dọc.
//72.linkColor: Màu sắc của liên kết văn bản.
//73.isElegantTextHeight: Chế độ chiều cao văn bản tinh tế.
//74.baselineShift: Dịch chuyển baseline của văn bản.
//75.autoHinting: Chế độ tự động gợi ý cho văn bản.
//76.isAntiAlias: Chế độ ch
//
//38.linkColor: Đây là màu sắc được sử dụng cho văn bản liên kết trong phương thức drawText. Khi vẽ văn bản có liên kết, màu sắc này được áp dụng cho các phần tử liên kết.
//39.isElegantTextHeight: Thuộc tính này xác định xem chiều cao của văn bản có phải là chiều cao tinh tế hay không. Khi được thiết lập thành true, nó sẽ cố gắng tăng chiều cao của văn bản để nó trông đẹp hơn, đặc biệt là khi sử dụng phông chữ không đồng nhất.
//40.baselineShift: Thuộc tính này xác định dịch chuyển đường cơ sở (baseline) của văn bản. Bằng cách thay đổi giá trị này, bạn có thể điều chỉnh vị trí dọc của văn bản.
//41.autoHinting: Đây là chế độ tự động gợi ý cho văn bản. Khi được thiết lập thành true, nó sẽ tự động áp dụng gợi ý để cải thiện hiển thị của văn bản trên các thiết bị khác nhau.
//42.isAntiAlias: Thuộc tính này xác định xem chế độ chống răng cưa (anti-aliasing) có được kích hoạt hay không. Khi chống răng cưa được bật, các đường vẽ sẽ được làm mịn để tránh hiện tượng răng cưa và làm cho hình ảnh trông mượt mà hơn.
//43.isDither: Thuộc tính này xác định xem chế độ dithering có được kích hoạt hay không. Khi dithering được bật, nó sẽ tạo ra hiệu ứng gradient mịn hơn bằng cách sử dụng các màu sắc gần nhau để làm cho sự chuyển đổi màu sắc trông tự nhiên hơn.
//44.isFakeBoldText: Đây là thuộc tính xác định xem văn bản có được hiển thị dày hơn không. Khi được thiết lập thành true, nó tạo ra hiệu ứng văn bản đậm giả tạo bằng cách làm mịn các đường nét.
//45.isLinearText: Thuộc tính này xác định xem văn bản có được hiển thị dọc hay không. Khi được thiết lập thành true, nó sẽ hiển thị văn bản theo chiều dọc.
//46.isSubpixelText: Đây là thuộc tính xác định xem văn bản có được hiển thị chính xác hơn trên màn hình LCD hay không. Khi được kích hoạt, nó sẽ cố gắng hiển thị các đường nét văn bản mịn hơn bằng cách sử dụng các pixel màu sắc gần nhau.
//47.isUnderlineText: Thuộc tính này xác định xem văn bản có được gạch chân hay không. Khi được thiết lập thành true, nó sẽ thêm một đường gạch chân dưới văn bản.
//48.isStrikeThruText: Đây là thuộc tính xác định xem văn bản có được gạch ngang hay không. Khi được thiết lập thành true, nó sẽ thêm một đường gạch ngang qua văn
//
//Dưới đây là 10 phương thức quan trọng của lớp Canvas trong Android. Tuy nhiên, chỉ có 10 phương thức được liệt kê dưới đây, không phải là 50:
//1.drawBitmap(Bitmap bitmap, float left, float top, Paint paint): Vẽ một đối tượng Bitmap lên Canvas tại vị trí xác định bởi left và top sử dụng Paint để chỉ định thuộc tính vẽ.
//2.drawRect(float left, float top, float right, float bottom, Paint paint): Vẽ một hình chữ nhật trên Canvas với các cạnh xác định bởi left, top, right và bottom sử dụng Paint để chỉ định thuộc tính vẽ.
//3.drawCircle(float cx, float cy, float radius, Paint paint): Vẽ một hình tròn trên Canvas với tâm xác định bởi cx, cy và bán kính radius sử dụng Paint để chỉ định thuộc tính vẽ.
//4.drawText(String text, float x, float y, Paint paint): Vẽ một đoạn văn bản lên Canvas tại vị trí xác định bởi x và y sử dụng Paint để chỉ định thuộc tính vẽ.
//5.drawLine(float startX, float startY, float stopX, float stopY, Paint paint): Vẽ một đường thẳng trên Canvas từ điểm bắt đầu (startX, startY) đến điểm kết thúc (stopX, stopY) sử dụng Paint để chỉ định thuộc tính vẽ.
//6.drawPath(Path path, Paint paint): Vẽ một đường cong được xác định bởi đối tượng Path trên Canvas sử dụng Paint để chỉ định thuộc tính vẽ.
//7.drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint): Vẽ một cung tròn hoặc cung hình chữ nhật trên Canvas dựa trên oval, startAngle (góc bắt đầu), và sweepAngle (góc quét) sử dụng Paint để chỉ định thuộc tính vẽ.
//8.drawOval(RectF oval, Paint paint): Vẽ một hình oval (hình bầu dục) trên Canvas dựa trên hình chữ nhật oval sử dụng Paint để chỉ định thuộc tính vẽ.
//9.drawRoundRect(RectF rect, float rx, float ry, Paint paint): Vẽ một hình chữ nhật với các góc được bo tròn trên Canvas dựa trên hình chữ nhật rect, rx (bán kính bo tròn theo trục X) và ry (bán kính bo tròn theo trục Y) sử dụng Paint để chỉ định thuộc tính vẽ.
//10.save(): Lưu trạng thái của Canvas, bao gồm ma trận biến đổi, để có thể khôi phục lại sau này bằng cách sử dụng restore().
//
//
//Dưới đây là 10 thuộc tính của lớp Canvas trong Android:
//1.mDensity: Độ mật độ điểm ảnh (density) của Canvas.
//2.mDensityScale: Tỷ lệ điểm ảnh (density scale) của Canvas.
//3.mMatrix: Ma trận biến đổi (transformation matrix) của Canvas.
//4.mClipBounds: Giới hạn cắt (clip bounds) của Canvas.
//5.mDrawFilter: Bộ lọc vẽ (draw filter) của Canvas.
//6.mSaveCount: Số lần lưu trạng thái (save count) của Canvas.
//7.mHwuiRenderer: Renderer của Canvas cho GPU.
//8.mHwuiLayer: Layer của Canvas cho GPU.
//9.mIsHwuiRendererDirty: Trạng thái renderer của Canvas có bị dirty hay không.
//10.mHwuiOpaqueLayer: Layer không trong suốt (opaque layer) của Canvas cho GPU.
//Lớp Canvas cung cấp nhiều thuộc tính và phương thức khác để điều khiển và tương tác với vùng vẽ.
//Tell me more.
//
//Assistant
//Poe
//Dưới đây là một số thuộc tính và phương thức khác của lớp Canvas trong Android:
//Thuộc tính của Canvas:
//1.mWidth: Chiều rộng của Canvas.
//2.mHeight: Chiều cao của `Canvas.
//3.mDensityDpi: Độ phân giải điểm ảnh (dpi) của Canvas.
//4.mDensityScale: Tỷ lệ điểm ảnh (density scale) của Canvas.
//5.mDensity: Độ mật độ điểm ảnh (density) của Canvas.
//6.mMatrix: Ma trận biến đổi (transformation matrix) của Canvas.
//7.mClipBounds: Giới hạn cắt (clip bounds) của Canvas.
//8.mDrawFilter: Bộ lọc vẽ (draw filter) của Canvas.
//9.mSaveCount: Số lần lưu trạng thái (save count) của Canvas.
//10.mHwuiRenderer: Renderer của Canvas cho GPU.
//11.mHwuiLayer: Layer của Canvas cho GPU.
//12.mIsHwuiRendererDirty: Trạng thái renderer của Canvas có bị dirty hay không.
//13.mHwuiOpaqueLayer: Layer không trong suốt (opaque layer) của Canvas cho GPU.
//Phương thức của Canvas:
//1.drawBitmap(Bitmap bitmap, float left, float top, Paint paint): Vẽ một đối tượng Bitmap lên Canvas tại vị trí xác định.
//2.drawRect(float left, float top, float right, float bottom, Paint paint): Vẽ một hình chữ nhật trên Canvas.
//3.drawCircle(float cx, float cy, float radius, Paint paint): Vẽ một hình tròn trên Canvas.
//4.drawText(String text, float x, float y, Paint paint): Vẽ một đoạn văn bản lên Canvas.
//5.drawLine(float startX, float startY, float stopX, float stopY, Paint paint): Vẽ một đường thẳng trên Canvas.
//6.drawPath(Path path, Paint paint): Vẽ một đường cong (path) trên Canvas.
//7.drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint): Vẽ một cung tròn hoặc cung hình chữ nhật trên Canvas.
//8.drawOval(RectF oval, Paint paint): Vẽ một hình oval (hình bầu dục) trên Canvas.
//9.drawRoundRect(RectF rect, float rx, float ry, Paint paint): Vẽ một hình chữ nhật với các góc được bo tròn trên Canvas.
//10.save(): Lưu trạng thái của Canvas để có thể khôi phục lại sau này bằng cách sử dụng restore().
//
//Trong phương thức onTouchEvent của Android, có một số sự kiện touch event phổ biến mà thường được sử dụng. Dưới đây là một số sự kiện quan trọng:
//1.ACTION_DOWN: Đây là sự kiện xảy ra khi người dùng chạm xuống màn hình. Sự kiện này thường được sử dụng để bắt đầu ghi nhận các hành động của người dùng, như việc bắt đầu di chuyển hoặc vẽ trên màn hình.
//2.ACTION_MOVE: Sự kiện này xảy ra khi người dùng di chuyển ngón tay trên màn hình sau khi đã chạm xuống. Sự kiện này thường được sử dụng để phản ứng và xử lý sự di chuyển của người dùng trên màn hình, ví dụ như kéo, vuốt, hoặc vẽ.
//3.ACTION_UP: Đây là sự kiện xảy ra khi người dùng nhấc ngón tay khỏi màn hình. Sự kiện này thường được sử dụng để kết thúc ghi nhận các hành động của người dùng và thực hiện các hành động cuối cùng dựa trên hành vi của họ.
//4.ACTION_CANCEL: Sự kiện này xảy ra khi một touch event bị hủy bỏ. Điều này có thể xảy ra khi một sự kiện bên ngoài tác động vào, ví dụ như cuộc gọi đến hoặc thông báo xuất hiện. Sự kiện này thường được sử dụng để làm sạch và hủy bỏ bất kỳ trạng thái hoặc tài nguyên nào đã được cấp phát trong touch event trước đó.
//Ngoài ra, còn một số sự kiện touch event khác như ACTION_POINTER_DOWN, ACTION_POINTER_UP, ACTION_OUTSIDE, ACTION_HOVER, và ACTION_SCROLL. Tuy nhiên, sử dụng các sự kiện này phụ thuộc vào yêu cầu cụ thể của ứng dụng của bạn.
//Khi xử lý các sự kiện trong onTouchEvent, bạn có thể sử dụng các phương thức của đối tượng MotionEvent để lấy thông tin chi tiết về sự kiện, chẳng hạn như tọa độ của chạm, chỉ số ngón tay, và thời gian diễn ra sự kiện.
//
//
//Trong phương thức onTouchEvent của Android, bạn có thể sử dụng các thuộc tính của đối tượng MotionEvent để truy cập thông tin chi tiết về sự kiện touch. Dưới đây là một số thuộc tính quan trọng:
//1.getAction(): Trả về mã hành động của sự kiện touch. Bạn có thể sử dụng các hằng số trong lớp MotionEvent để so sánh với kết quả của phương thức này, ví dụ: MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE, MotionEvent.ACTION_UP, và MotionEvent.ACTION_CANCEL.
//2.getX(), getY(): Trả về tọa độ X và Y của điểm chạm hiện tại, tính từ góc trên bên trái của view. Các tọa độ này có thể được sử dụng để xác định vị trí chạm của người dùng trên màn hình.
//3.getPointerCount(): Trả về số lượng ngón tay đang tham gia trong sự kiện touch. Điều này rất hữu ích khi xử lý các sự kiện multi-touch, khi bạn muốn biết có bao nhiêu ngón tay đang chạm vào màn hình cùng lúc.
//4.getPointerId(index): Trả về ID của ngón tay tại chỉ mục cụ thể trong sự kiện touch. ID này là duy nhất cho từng ngón tay và giúp bạn phân biệt các ngón tay khi xử lý các sự kiện multi-touch.
//5.getHistoricalX(index, pos), getHistoricalY(index, pos): Trả về tọa độ X và Y của ngón tay tại chỉ mục index và thời điểm pos trong quá khứ. Điều này cho phép bạn truy cập vào các tọa độ lịch sử của ngón tay trong quá trình di chuyển.
//6.getPressure(index): Trả về áp lực được áp dụng lên màn hình bởi ngón tay tại chỉ mục index. Giá trị này thường được sử dụng trong trường hợp cần đo lường áp lực chạm của người dùng.
//7.getEventTime(): Trả về thời điểm diễn ra sự kiện touch, tính bằng mili giây từ khi hệ thống khởi động.
//Bằng cách sử dụng các thuộc tính này, bạn có thể lấy thông tin chi tiết về sự kiện touch và sử dụng chúng để xử lý tương ứng trong ứng dụng của mình.
//thêm nữa
//
//Assistant
//Poe
//Dưới đây là một số thuộc tính khác của đối tượng MotionEvent mà bạn có thể sử dụng trong phương thức onTouchEvent:
//1.getRawX(), getRawY(): Trả về tọa độ X và Y tuyệt đối của điểm chạm hiện tại, tính từ góc trên bên trái của màn hình. Các tọa độ này không bị ảnh hưởng bởi vị trí của view hiện tại, mà thể hiện vị trí chạm trên toàn màn hình.
//2.getPointerIdBits(): Trả về một bitset biểu thị các ngón tay có mặt trong sự kiện touch. Bit tương ứng với mỗi ngón tay sẽ được đặt là 1 nếu ngón tay đó hiện diện trong sự kiện, và 0 nếu không. Phương thức này hữu ích khi bạn muốn kiểm tra xem một ngón tay cụ thể có tham gia vào sự kiện hay không.
//3.getToolType(index): Trả về loại công cụ được sử dụng bởi ngón tay tại chỉ mục index. Các giá trị trả về có thể là TOOL_TYPE_FINGER (ngón tay), TOOL_TYPE_STYLUS (bút cảm ứng), hoặc TOOL_TYPE_MOUSE (chuột), tùy thuộc vào loại công cụ sử dụng để chạm vào màn hình.
//4.getAxisValue(axis): Trả về giá trị của trục được chỉ định trong sự kiện touch. Các trục có thể là AXIS_X (trục X), AXIS_Y (trục Y), AXIS_PRESSURE (áp lực), và nhiều trục khác. Phương thức này cho phép bạn lấy giá trị của các trục khác nhau trong sự kiện touch.
//5.getSize(index): Trả về kích thước của ngón tay tại chỉ mục index. Giá trị này thường được sử dụng để đo lường kích thước diện tích chạm của ngón tay.
//
//Trong phương thức onTouchEvent của Android, bạn có thể sử dụng các phương thức của đối tượng MotionEvent để thực hiện các thao tác và xử lý sự kiện touch. Dưới đây là một số phương thức quan trọng:
//1.getActionMasked(): Trả về hành động của sự kiện touch, được mã hóa trong một số nguyên. Bạn có thể sử dụng phương thức này để xác định hành động chính của sự kiện mà không xét đến các chỉ số ngón tay. Điều này hữu ích trong việc so sánh với các hằng số trong lớp MotionEvent, như MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE, MotionEvent.ACTION_UP, và MotionEvent.ACTION_CANCEL.
//2.findPointerIndex(pointerId): Trả về chỉ mục của ngón tay với pointerId tương ứng trong sự kiện touch. Điều này giúp bạn xác định chỉ mục của ngón tay khi bạn chỉ có pointerId nhưng không biết chỉ mục tương ứng.
//3.getPointerId(pointerIndex): Trả về pointerId của ngón tay tại chỉ mục pointerIndex. pointerId là một số duy nhất đại diện cho từng ngón tay trong sự kiện touch.
//4.getX(pointerIndex), getY(pointerIndex): Trả về tọa độ X và Y của ngón tay tại chỉ mục pointerIndex trong sự kiện touch. Các tọa độ này cung cấp vị trí chạm của người dùng trên màn hình.
//5.getHistoricalX(pointerIndex, pos), getHistoricalY(pointerIndex, pos): Trả về tọa độ X và Y của ngón tay tại chỉ mục pointerIndex và thời điểm pos trong quá khứ. Điều này cho phép bạn truy cập vào các tọa độ lịch sử của ngón tay trong quá trình di chuyển.
//6.getPointerCount(): Trả về số lượng ngón tay đang tham gia trong sự kiện touch. Điều này rất hữu ích khi xử lý các sự kiện multi-touch, khi bạn muốn biết có bao nhiêu ngón tay đang chạm vào màn hình cùng lúc.
//7.getPointerCoords(pointerIndex, outPointerCoords): Điền thông tin về tọa độ và thuộc tính của ngón tay tại chỉ mục pointerIndex vào đối tượng outPointerCoords. Đối tượng outPointerCoords sẽ chứa thông tin chi tiết như tọa độ X, Y, áp lực và kích thước.
//8.getPressure(pointerIndex): Trả về áp lực được áp dụng lên màn hình bởi ngón tay tại chỉ mục pointerIndex. Giá trị này thường được sử dụng để đo lường áp lực chạm của người dùng.
//
//Trên Android, bạn có thể lấy danh sách các cảm biến bằng cách sử dụng lớp SensorManager và phương thức getSensorList(). Dưới đây là một ví dụ cụ thể:
//SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
//
//// Lặp qua danh sách sensorList để truy cập thông tin từng cảm biến
//for (Sensor sensor : sensorList) {
//    String sensorName = sensor.getName();
//    String sensorVendor = sensor.getVendor();
//    int sensorType = sensor.getType();
//
//    // In ra thông tin cảm biến
//    Log.d("Sensor Info", "Name: " + sensorName);
//    Log.d("Sensor Info", "Vendor: " + sensorVendor);
//    Log.d("Sensor Info", "Type: " + sensorType);
//}
//
//Thiếu Read-Write Firebase
//Signing.kt
//
//1.package com.example.firebaserealtimedatabase  
//2.  
//3.import android.content.Intent  
//4.import androidx.appcompat.app.AppCompatActivity  
//5.import android.os.Bundle  
//6.import android.text.TextUtils  
//7.import android.util.Log  
//8.import android.view.View  
//9.import android.widget.Toast  
//10.import com.google.firebase.auth.FirebaseAuth  
//11.import kotlinx.android.synthetic.main.activity_main.*  
//12.  
//13.class Signing : AppCompatActivity() {  
//14.  
//15.    private var mAuth: FirebaseAuth?=null  
//16.  
//17.    override fun onCreate(savedInstanceState: Bundle?) {  
//18.        super.onCreate(savedInstanceState)  
//19.        setContentView(R.layout.activity_signing)  
//20.  
//21.        //Initialize Firebase Auth  
//22.        mAuth=FirebaseAuth.getInstance()  
//23.    }  
//24.  
//25.    public override fun onStart() {  
//26.        super.onStart()  
//27.  
//28.        //if user logged in, go to sign in screen  
//29.        if(mAuth!!.currentUser!=null){  
//30.            startActivity(Intent(this,welcome::class.java))  
//31.            finish()  
//32.        }  
//33.    }  
//34.  
//35.    override fun onResume() {  
//36.        super.onResume()  
//37.        progressBar.visibility= View.GONE  
//38.    }  
//39.  
//40.    fun loginButtonClicked(view: View){  
//41.        if(TextUtils.isEmpty(email.text.toString())){  
//42.            Toast.makeText(applicationContext,"Enter Username!", Toast.LENGTH_LONG).show()  
//43.            return  
//44.        }  
//45.        if(TextUtils.isEmpty(password.text.toString())){  
//46.            Toast.makeText(applicationContext,"Enter password!", Toast.LENGTH_LONG).show()  
//47.            return  
//48.        }  
//49.        progressBar.visibility=View.VISIBLE  
//50.  
//51.        //Authenticate user  
//52.        mAuth!!.signInWithEmailAndPassword(email.text.toString(),password.text.toString())  
//53.            .addOnCompleteListener(this){task ->  
//54.  
//55.                progressBar.visibility=View.GONE  
//56.  
//57.                if(task.isSuccessful){  
//58.                    val intent=Intent(this,welcome::class.java)  
//59.              
//       startActivity(intent)
//  
//  
//60.                    finish()  
//61.                }else{  
//62.                    if(password.text.toString().length<6){  
//63.                        password.error="Password is too short, enter minimum 6 characters"  
//64.                    }  
//65.                    Toast.makeText(this,"Authentication Failed"+task.exception,Toast.LENGTH_SHORT).show()  
//66.                }  
//67.            }  
//68.    }  
//69.}  
//
////Demo FB
//MainActivity.java
//package info.androidhive.firebase;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String TAG = MainActivity.class.getSimpleName();
//    private TextView txtDetails;
//    private EditText inputName, inputEmail;
//    private Button btnSave;
//    private DatabaseReference mFirebaseDatabase;
//    private FirebaseDatabase mFirebaseInstance;
//
//    private String userId;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Displaying toolbar icon
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
//
//        txtDetails = (TextView) findViewById(R.id.txt_user);
//        inputName = (EditText) findViewById(R.id.name);
//        inputEmail = (EditText) findViewById(R.id.email);
//        btnSave = (Button) findViewById(R.id.btn_save);
//
//        mFirebaseInstance = FirebaseDatabase.getInstance();
//
//        // get reference to 'users' node
//        mFirebaseDatabase = mFirebaseInstance.getReference("users");
//
//        // store app title to 'app_title' node
//        mFirebaseInstance.getReference("app_title").setValue("Realtime Database");
//
//        // app_title change listener
//        mFirebaseInstance.getReference("app_title").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Log.e(TAG, "App title updated");
//
//                String appTitle = dataSnapshot.getValue(String.class);
//
//                // update toolbar title
//                getSupportActionBar().setTitle(appTitle);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                Log.e(TAG, "Failed to read app title value.", error.toException());
//            }
//        });
//
//        // Save / update the user
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = inputName.getText().toString();
//                String email = inputEmail.getText().toString();
//
//                // Check for already existed userId
//                if (TextUtils.isEmpty(userId)) {
//                    createUser(name, email);
//                } else {
//                    updateUser(name, email);
//                }
//            }
//        });
//
//        toggleButton();
//    }
//
//    // Changing button text
//    private void toggleButton() {
//        if (TextUtils.isEmpty(userId)) {
//            btnSave.setText("Save");
//        } else {
//            btnSave.setText("Update");
//        }
//    }
//
//    /**
//     * Creating new user node under 'users'
//     */
//        private void createUser(String name, String email) {
//            // TODO
//            // In real apps this userId should be fetched
//            // by implementing firebase auth
//            if (TextUtils.isEmpty(userId)) {
//                userId = mFirebaseDatabase.push().getKey();
//            }
//
//            User user = new User(name, email);
//
//            mFirebaseDatabase.child(userId).setValue(user);
//
//            addUserChangeListener();
//        }
//
//        /**
//         * User data change listener
//         */
//        private void addUserChangeListener() {
//            // User data change listener
//            mFirebaseDatabase.child(userId).addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    User user = dataSnapshot.getValue(User.class);
//
//                    // Check for null
//                    if (user == null) {
//                        Log.e(TAG, "User data is null!");
//                        return;
//                    }
//
//                    Log.e(TAG, "User data is changed!" + user.name + ", " + user.email);
//
//                    // Display newly updated name and email
//                    txtDetails.setText(user.name + ", " + user.email);
//
//                    // clear edit text
//                    inputEmail.setText("");
//                    inputName.setText("");
//
//                    toggleButton();
//                }
//
//                @Override
//                public void onCancelled(DatabaseError error) {
//                    // Failed to read value
//                    Log.e(TAG, "Failed to read user", error.toException());
//                }
//            });
//        }
//
//        private void updateUser(String name, String email) {
//            // updating the user via child nodes
//            if (!TextUtils.isEmpty(name))
//                mFirebaseDatabase.child(userId).child("name").setValue(name);
//
//            if (!TextUtils.isEmpty(email))
//                mFirebaseDatabase.child(userId).child("email").setValue(email);
//        }
//    }
//    Vip Firebase
//1.Truy cập và thao tác với Firebase Realtime Database trong ứng dụng Android:
//            Trong Activity hoặc Fragment của bạn, khởi tạo một đối tượng DatabaseReference để truy cập vào một nút cụ thể trong Firebase Realtime Database:
//    java
//            Copier
//import com.google.firebase.database.DatabaseReference;import com.google.firebase.database.FirebaseDatabase;// Khởi tạo DatabaseReferenceDatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference("users");
//CREATE: Thêm dữ liệu mới:
//    java
//            Copier
//// Thêm dữ liệu mớiString userId = databaseRef.push().getKey();User user = new User("John Doe", "john@example.com", 25);databaseRef.child(userId).setValue(user);
//READ: Đọc dữ liệu:
//    java
//            Copier
//// Đọc dữ liệu một lầndatabaseRef.addListenerForSingleValueEvent(new ValueEventListener() {    @Override    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {        for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {            User user = userSnapshot.getValue(User.class);            // Xử lý dữ liệu        }
//}
//    @Override    public void onCancelled(@NonNull DatabaseError databaseError) {        // Xử lý lỗi    }
//    });
//        UPDATE: Cập nhật dữ liệu:
//        java
//        Copier
//// Cập nhật dữ liệuString userId = "USER_ID";Map<String, Object> updatedData = new HashMap<>();updatedData.put("age", 26);databaseRef.child(userId).updateChildren(updatedData);
//        DELETE: Xóa dữ liệu:
//        java
//        Copier
//// Xóa dữ liệuString userId = "USER_ID";databaseRef.child(userId).removeValue();
//        Lưu ý rằng trong ví dụ trên, bạn cần thay thế "users" bằng tên của nút chứa dữ liệu của bạn trong Firebase Realtime Database.
//        Với các phương thức setValue, updateChildren, và removeValue, dữ liệu sẽ được lưu trữ và cập nhật trong Firebase Realtime Database trên máy chủ và sẽ tự động đồng bộ với các thiết bị khác khi có kết nối mạng.
//        khi mất kết nối vẫn hiển thị dữ liệu off cho người dùng
//
//        Assistant
//        Poe
//        Để hiển thị dữ liệu offline cho người dùng khi mất kết nối, bạn có thể sử dụng cơ chế lưu trữ dữ liệu offline của Firebase Realtime Database và kết hợp với việc sử dụng một cơ sở dữ liệu local trên thiết bị, chẳng hạn như SQLite hoặc SharedPreferences.
//        Khi ứng dụng có kết nối mạng, bạn có thể lưu trữ dữ liệu từ Firebase Realtime Database vào cơ sở dữ liệu local trên thiết bị. Khi mất kết nối, bạn có thể truy xuất dữ liệu từ cơ sở dữ liệu local và hiển thị cho người dùng.
//        Dưới đây là một ví dụ về cách thực hiện điều này trong Android:
//        1.Sử dụng Firebase Realtime Database để lấy dữ liệu:
//        java
//        Copier
//        DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference("users");databaseRef.addValueEventListener(new ValueEventListener() {    @Override    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {        // Lấy dữ liệu từ dataSnapshot và lưu trữ vào cơ sở dữ liệu local        // Ví dụ: lưu trữ dữ liệu vào SQLite hoặc SharedPreferences    }
//@Override    public void onCancelled(@NonNull DatabaseError databaseError) {        // Xử lý lỗi khi không thể kết nối tới Firebase Realtime Database    }
//        });
//        1.Lưu trữ dữ liệu vào cơ sở dữ liệu local (ví dụ: SQLite):
//        java
//        Copier
//// Trong phương thức onDataChange// Lưu trữ dữ liệu vào SQLite// Ví dụ: tạo và cập nhật bảng "users" trong cơ sở dữ liệu SQLiteSQLiteDatabase db = dbHelper.getWritableDatabase();db.delete("users", null, null); // Xóa toàn bộ dữ liệu cũfor (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {    User user = userSnapshot.getValue(User.class);    // Thêm dữ liệu vào bảng "users" trong SQLite    ContentValues values = new ContentValues();    values.put("name", user.getName());    values.put("email", user.getEmail());    values.put("age", user.getAge());    db.insert("users", null, values);}
//        db.close();
//        1.Khi mất kết nối, truy xuất dữ liệu từ cơ sở dữ liệu local và hiển thị cho người dùng:
//        java
//        Copier
//// Đọc dữ liệu từ cơ sở dữ liệu local (ví dụ: SQLite) và hiển thị cho người dùngSQLiteDatabase db = dbHelper.getReadableDatabase();Cursor cursor = db.query("users", null, null, null, null, null, null);while (cursor.moveToNext()) {    String name = cursor.getString(cursor.getColumnIndex("name"));    String email = cursor.getString(cursor.getColumnIndex("email"));    int age = cursor.getInt(cursor.getColumnIndex("age"));    // Hiển thị thông tin người dùng cho người dùng offline}
//        cursor.close();
//        db.close();
//        Trong ví dụ trên, bạn cần thay đổi các phần tương ứng để phù hợp với cơ sở dữ liệu local mà bạn sử dụng, chẳng hạn như SQLite hoặc SharedPreferences.
//        Qua việc sử dụng cơ chế lưu trữ dữ liệu offline của Firebase Realtime Database kết hợp với cơ sở dữ liệu local, bạn có thể hiển thị dữ liệu offline cho người dùng khi mất kết nối mạng.
//        dbHelper khai báo ở đâu
//
//        Assistant
//        Poe
//        Trong ví dụ trước, dbHelper là một đối tượng của lớp trợ giúp (helper class) để làm việc với cơ sở dữ liệu SQLite trong Android. Đối tượng này được khai báo và sử dụng trong phạm vi của Activity hoặc Fragment của bạn.
//        Dưới đây là một ví dụ cách khai báo và sử dụng dbHelper trong Android:
//        1.Tạo một lớp trợ giúp để làm việc với cơ sở dữ liệu SQLite:
//        java
//        Copier
//        import android.content.Context;import android.database.sqlite.SQLiteDatabase;import android.database.sqlite.SQLiteOpenHelper;public class DatabaseHelper extends SQLiteOpenHelper {    private static final String DATABASE_NAME = "mydatabase.db";    private static final int DATABASE_VERSION = 1;    public DatabaseHelper(Context context) {        super(context, DATABASE_NAME, null, DATABASE_VERSION);    }
//    @Override    public void onCreate(SQLiteDatabase db) {        // Tạo bảng và các cấu trúc cần thiết trong cơ sở dữ liệu        String createTableQuery = "CREATE TABLE users (name TEXT, email TEXT, age INTEGER)";        db.execSQL(createTableQuery);
//    }
//    @Override    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {        // Xử lý khi cần nâng cấp cơ sở dữ liệu lên phiên bản mới hơn    }
//    }

//1.Trong Activity hoặc Fragment của bạn, khai báo và sử dụng dbHelper:
//    java
//            Copier
//    public class MainActivity extends AppCompatActivity {    private DatabaseHelper dbHelper;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//        dbHelper = new DatabaseHelper(this);    }
//        // Các phương thức khác của Activity hoặc Fragment}
//        Trong ví dụ trên, dbHelper được khai báo là một biến thành viên (member variable) của Activity hoặc Fragment (MainActivity trong trường hợp này). Bạn có thể truy cập dbHelper từ các phương thức khác trong android.app.Activity hoặc Fragment để thực hiện các thao tác với cơ sở dữ liệu SQLite, như thêm, cập nhật hoặc truy vấn dữ liệu.
//        Lưu ý rằng bạn cần thay thế DatabaseHelper bằng tên lớp trợ giúp thực sự mà bạn đã tạo trong dự án của mình.
//        cụ thể các hàm insert updat delete
//
//                Assistant
//        Poe
//        Dưới đây là các hàm cơ bản để thực hiện các thao tác Insert, Update và Delete trong cơ sở dữ liệu SQLite trong Android, sử dụng một đối tượng dbHelper từ ví dụ trước:
//                1.Hàm Insert (Thêm dữ liệu vào bảng):
//        java
//                Copier
//        public void insertUser(String name, String email, int age) {    SQLiteDatabase db = dbHelper.getWritableDatabase();    ContentValues values = new ContentValues();    values.put("name", name);    values.put("email", email);    values.put("age", age);    db.insert("users", null, values);    db.close();
//        }
//1.Hàm Update (Cập nhật dữ liệu trong bảng):
//        java
//                Copier
//        public void updateUser(String name, String email, int age) {    SQLiteDatabase db = dbHelper.getWritableDatabase();    ContentValues values = new ContentValues();    values.put("name", name);    values.put("email", email);    values.put("age", age);    db.update("users", values, "name=?", new String[]{name});    db.close();
//        }
//1.Hàm Delete (Xóa dữ liệu từ bảng):
//        java
//                Copier
//        public void deleteUser(String name) {    SQLiteDatabase db = dbHelper.getWritableDatabase();    db.delete("users", "name=?", new String[]{name});    db.close();
//        }
//        Trong các hàm trên, chúng ta sử dụng phương thức getWritableDatabase() để có được một đối tượng SQLiteDatabase để thao tác với cơ sở dữ liệu. Sau khi hoàn thành các thao tác, chúng ta đóng kết nối với cơ sở dữ liệu bằng cách gọi db.close() để giải phóng tài nguyên.
//        Lưu ý rằng trong các ví dụ trên, chúng ta sử dụng tên bảng là "users". Bạn cần thay thế "users" bằng tên bảng thực sự mà bạn đang làm việc trong cơ sở dữ liệu của mình.
//        Để sử dụng các hàm trên, bạn có thể gọi chúng từ Activity hoặc Fragment của bạn, ví dụ:
//        java
//                Copier
//        // Insert dữ liệu mớiinsertUser("John Doe", "john@example.com", 25);// Update dữ liệuupdateUser("John Doe", "newemail@example.com", 26);// Xóa dữ liệudeleteUser("John Doe");
//        Lưu ý rằng các ví dụ trên chỉ là các ví dụ cơ bản. Trong thực tế, bạn có thể tùy chỉnh và mở rộng các hàm này để phù hợp với nhu cầu cụ thể của ứng dụng của bạn.
//
//        Để lưu thông tin người dùng vào Firebase Realtime Database thay vì Firestore, bạn có thể thực hiện các bước sau:
//                1.Đảm bảo bạn đã thêm phụ thuộc Firebase Realtime Database vào file build.gradle của ứng dụng Android:
//        groovy
//                Copier
//        implementation 'com.google.firebase:firebase-database:20.0.0'
//                1.Trong Activity hoặc Fragment của bạn, sau khi tài khoản người dùng được tạo thành công, sử dụng FirebaseDatabase để lưu thông tin vào Realtime Database:
//        java
//                Copier
//import com.google.firebase.auth.FirebaseAuth;import com.google.firebase.database.DatabaseReference;import com.google.firebase.database.FirebaseDatabase;// ...private FirebaseAuth mAuth;private FirebaseDatabase mDatabase;@Overrideprotected void onCreate(Bundle savedInstanceState) {    super.onCreate(savedInstanceState);    // Khởi tạo Firebase Authentication và Realtime Database    mAuth = FirebaseAuth.getInstance();
//        mDatabase = FirebaseDatabase.getInstance();
//        // ...}
//        private void registerUser(String name, String phone, String email, String password) {    mAuth.createUserWithEmailAndPassword(email, password)        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {            @Override            public void onComplete(@NonNull Task<AuthResult> task) {                if (task.isSuccessful()) {                    // Tài khoản người dùng đã được tạo thành công                    FirebaseUser user = mAuth.getCurrentUser();
//            // Lưu thông tin bổ sung vào tài khoản người dùng                    if (user != null) {                        String userId = user.getUid();                        DatabaseReference userRef = mDatabase.getReference("users").child(userId);                        userRef.child("name").setValue(name);                        userRef.child("phone").setValue(phone)                            .addOnSuccessListener(new OnSuccessListener<Void>() {                                @Override                                public void onSuccess(Void aVoid) {                                    // Thành công - tài khoản đã được tạo và thông tin đã được lưu trữ                                }
//        })                            .addOnFailureListener(new OnFailureListener() {                                @Override                                public void onFailure(@NonNull Exception e) {                                    // Xử lý lỗi khi lưu thông tin người dùng                                }
//        });
//        }                } else {                    // Xử lý lỗi khi tạo tài khoản người dùng                }
//        }
//        });
//        }
//        Trong ví dụ trên, chúng ta sử dụng FirebaseDatabase để tham chiếu đến nút "users" trong Realtime Database và tạo một child node mới với userId của người dùng. Sau đó, chúng ta sử dụng phương thức setValue() để lưu thông tin tên và số điện thoại vào child node tương ứng.
//
//        Để lưu thông tin người dùng vào Firebase Realtime Database thay vì Firestore, bạn có thể thực hiện các bước sau:
//                1.Đảm bảo bạn đã thêm phụ thuộc Firebase Realtime Database vào file build.gradle của ứng dụng Android:
//        groovy
//                Copier
//        implementation 'com.google.firebase:firebase-database:20.0.0'
//                1.Trong Activity hoặc Fragment của bạn, sau khi tài khoản người dùng được tạo thành công, sử dụng FirebaseDatabase để lưu thông tin vào Realtime Database:
//        java
//                Copier
//import com.google.firebase.auth.FirebaseAuth;import com.google.firebase.database.DatabaseReference;import com.google.firebase.database.FirebaseDatabase;// ...private FirebaseAuth mAuth;private FirebaseDatabase mDatabase;@Overrideprotected void onCreate(Bundle savedInstanceState) {    super.onCreate(savedInstanceState);    // Khởi tạo Firebase Authentication và Realtime Database    mAuth = FirebaseAuth.getInstance();
//        mDatabase = FirebaseDatabase.getInstance();
//        // ...}
//        private void registerUser(String name, String phone, String email, String password) {    mAuth.createUserWithEmailAndPassword(email, password)        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {            @Override            public void onComplete(@NonNull Task<AuthResult> task) {                if (task.isSuccessful()) {                    // Tài khoản người dùng đã được tạo thành công                    FirebaseUser user = mAuth.getCurrentUser();
//            // Lưu thông tin bổ sung vào tài khoản người dùng                    if (user != null) {                        String userId = user.getUid();                        DatabaseReference userRef = mDatabase.getReference("users").child(userId);                        userRef.child("name").setValue(name);                        userRef.child("phone").setValue(phone)                            .addOnSuccessListener(new OnSuccessListener<Void>() {                                @Override                                public void onSuccess(Void aVoid) {                                    // Thành công - tài khoản đã được tạo và thông tin đã được lưu trữ                                }
//        })                            .addOnFailureListener(new OnFailureListener() {                                @Override                                public void onFailure(@NonNull Exception e) {                                    // Xử lý lỗi khi lưu thông tin người dùng                                }
//        });
//        }                } else {                    // Xử lý lỗi khi tạo tài khoản người dùng                }
//        }
//        });
//        }
//        Trong ví dụ trên, chúng ta sử dụng FirebaseDatabase để tham chiếu đến nút "users" trong Realtime Database và tạo một child node mới với userId của người dùng. Sau đó, chúng ta sử dụng phương thức setValue() để lưu thông tin tên và số điện thoại vào child node tương ứng.
//        check trường nhập vào là email trong andoroid
//
//        Assistant
//                Poe
//        Để kiểm tra xem một chuỗi nhập vào có đúng định dạng email hay không trong Android, bạn có thể sử dụng biểu thức chính quy (regular expression) và lớp Patterns của Android. Dưới đây là một ví dụ về cách kiểm tra trường nhập vào có phải là email hay không:
//        java
//                Copier
//import android.util.Patterns;// ...private boolean isValidEmail(String email) {    return Patterns.EMAIL_ADDRESS.matcher(email).matches();}
//        Trong ví dụ trên, Patterns.EMAIL_ADDRESS là một biểu thức chính quy được cung cấp sẵn bởi Android để kiểm tra định dạng email. Phương thức matcher(email).matches() sẽ kiểm tra xem chuỗi email có khớp với biểu thức chính quy hay không.
//        Bạn có thể sử dụng phương thức isValidEmail() trong quá trình kiểm tra trước khi đăng ký tài khoản người dùng. Ví dụ:
//        java
//                Copier
//        private void registerUser(String name, String phone, String email, String password) {    if (!isValidEmail(email)) {        // Email không hợp lệ, xử lý lỗi        return;    }
//            // Tiếp tục quá trình đăng ký tài khoản    // ...}
//            Trong ví dụ trên, nếu email không hợp lệ, bạn có thể thực hiện xử lý lỗi hoặc hiển thị thông báo cho người dùng.
//                    số điệmn thoại
//
//            Assistant
//                    Poe
//            Để kiểm tra xem một chuỗi nhập vào có đúng định dạng số điện thoại hay không trong Android, bạn có thể sử dụng biểu thức chính quy (regular expression) và lớp Patterns của Android. Dưới đây là một ví dụ về cách kiểm tra trường nhập vào có phải là số điện thoại hay không:
//            java
//                    Copier
//import android.util.Patterns;// ...private boolean isValidPhoneNumber(String phoneNumber) {    return Patterns.PHONE.matcher(phoneNumber).matches();}
//            Trong ví dụ trên, Patterns.PHONE là một biểu thức chính quy được cung cấp sẵn bởi Android để kiểm tra định dạng số điện thoại. Phương thức matcher(phoneNumber).matches() sẽ kiểm tra xem chuỗi phoneNumber có khớp với biểu thức chính quy hay không.
//                    Bạn có thể sử dụng phương thức isValidPhoneNumber() trong quá trình kiểm tra trước khi đăng ký tài khoản người dùng. Ví dụ:
//            java
//                    Copier
//            private void registerUser(String name, String phone, String email, String password) {    if (!isValidPhoneNumber(phone)) {        // Số điện thoại không hợp lệ, xử lý lỗi        return;    }
//                // Tiếp tục quá trình đăng ký tài khoản    // ...}
//                Trong ví dụ trên, nếu phone không hợp lệ, bạn có thể thực hiện xử lý lỗi hoặc hiển thị thông báo cho người dùng.
//                        kiểm tra tên user không trùng với user có rồi trên firebase
//
//                        Assistant
//                Poe
//                Để kiểm tra xem tên người dùng đã tồn tại hay chưa trên Firebase, bạn có thể sử dụng Firebase Realtime Database hoặc Firebase Firestore để thực hiện truy vấn dữ liệu. Dưới đây là một ví dụ về cách kiểm tra tên người dùng đã tồn tại hay chưa trong Firebase Realtime Database:
//                1.
//                Trước tiên, hãy đảm bảo rằng bạn đã khởi tạo và cấu hình Firebase Realtime Database trong ứng dụng của mình.
//                2.
//                3.
//                Trong Activity hoặc Fragment của bạn, sử dụng DatabaseReference để truy vấn dữ liệu từ Firebase Realtime Database:
//                4.
//                java
//                        Copier
//import com.google.firebase.auth.FirebaseAuth;import com.google.firebase.database.DataSnapshot;import com.google.firebase.database.DatabaseError;import com.google.firebase.database.DatabaseReference;import com.google.firebase.database.FirebaseDatabase;// ...private FirebaseAuth mAuth;private FirebaseDatabase mDatabase;@Overrideprotected void onCreate(Bundle savedInstanceState) {    super.onCreate(savedInstanceState);    // Khởi tạo Firebase Authentication và Realtime Database    mAuth = FirebaseAuth.getInstance();
//                mDatabase = FirebaseDatabase.getInstance();
//                // ...}
//                private void checkUsernameAvailability(String username) {    DatabaseReference usersRef = mDatabase.getReference("users");    usersRef.orderByChild("username").equalTo(username).addListenerForSingleValueEvent(new ValueEventListener() {        @Override        public void onDataChange(DataSnapshot dataSnapshot) {            if (dataSnapshot.exists()) {                // Tên người dùng đã tồn tại                // Xử lý tên người dùng bị trùng            } else {                // Tên người dùng không tồn tại                // Tiếp tục quá trình đăng ký tài khoản            }
//                }
//                    @Override        public void onCancelled(DatabaseError databaseError) {            // Xử lý lỗi khi truy vấn dữ liệu        }
//                    });
//                }
//                    Trong ví dụ trên, chúng ta sử dụng DatabaseReference để truy cập đến nút "users" trong Firebase Realtime Database. Sau đó, chúng ta sử dụng phương thức orderByChild("username").equalTo(username) để kiểm tra xem có bất kỳ nút nào trong "users" có trường "username" giống với username được truyền vào hay không.
//                    Phương thức addListenerForSingleValueEvent() sẽ lắng nghe sự kiện một lần duy nhất khi dữ liệu thay đổi. Trong phương thức onDataChange(), chúng ta kiểm tra xem dataSnapshot có tồn tại hay không. Nếu dataSnapshot tồn tại, có nghĩa là tên người dùng đã bị trùng. Ngược lại, nếu dataSnapshot không tồn tại, có nghĩa là tên người dùng chưa được sử dụng và bạn có thể tiếp tục quá trình đăng ký tài khoản.
//                    Hãy đảm bảo bạn thay thế "username" bằng trường tên người dùng tương ứng trong Firebase Realtime Database của bạn.
//                    kiểm tra mật khẩu nhập vào phải có các ký tự đặc biết chữ hoa số
//
//                    Assistant
//                            Poe
//                    Để kiểm tra xem mật khẩu nhập vào có chứa các ký tự đặc biệt, chữ hoa và số hay không, bạn có thể sử dụng biểu thức chính quy (regular expression) để so khớp với các yêu cầu này. Dưới đây là một ví dụ về cách kiểm tra mật khẩu:
//                    java
//                            Copier
//import java.util.regex.Pattern;// ...private boolean isValidPassword(String password) {    // Kiểm tra mật khẩu có ít nhất 8 ký tự, chứa ít nhất một chữ hoa, một số và một ký tự đặc biệt    String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";    return Pattern.compile(passwordPattern).matcher(password).matches();}
//                    Trong ví dụ trên, biểu thức chính quy ^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$ được sử dụng để kiểm tra mật khẩu. Biểu thức này có các yêu cầu sau:
//                            (?=.*[A-Z]): Ít nhất một chữ hoa.
//(?=.*\\d): Ít nhất một số.
//                            (?=.*[@#$%^&+=!]): Ít nhất một ký tự đặc biệt từ tập hợp @#$%^&+=!.
//                            .{8,}: Ít nhất 8 ký tự.
//                    Phương thức Pattern.compile(passwordPattern).matcher(password).matches() sẽ kiểm tra xem chuỗi password có khớp với biểu thức chính quy hay không.
//                    Bạn có thể sử dụng phương thức isValidPassword() trong quá trình kiểm tra trước khi đăng ký tài khoản người dùng. Ví dụ:
//                    java
//                            Copier
//                    private void registerUser(String name, String phone, String email, String password) {    if (!isValidPassword(password)) {        // Mật khẩu không đáp ứng yêu cầu, xử lý lỗi        return;    }
//                        // Tiếp tục quá trình đăng ký tài khoản    // ...}
//
//                        Dùng intent gửi dữ liệu:
//                        Gửi:
//                        Intent it=new Intent(MainActivity.this,play_game.class);
//                        Bundle bd=new Bundle();
//                        bd.putInt("tien",50);
//                        it.putExtra("sotien",bd);
//                        startActivity(it);
//                        Nhận:
//                        Intent it=getIntent();
//                        Bundle bundle=it.getBundleExtra("sotien");
//
//                        if(bundle!=null){
//                            tien=(int)bundle.get("tien");
//                            luuTien();
//                        }else {
//                            tien = luuSotien.getInt("Tien", 300);
//                        }
//
//                        txttien.setText(tien+"$");
//
//                        Để đếm thời gian và hiển thị nó lên màn hình trong ứng dụng Android, bạn có thể sử dụng lớp 
//                        CountDownTimer. Dưới đây là một ví dụ cách thực hiện điều đó:
//                        1.Trong Activity hoặc Fragment của bạn, khai báo một đối tượng CountDownTimer và thiết lập thời gian đếm ngược:
//                        java
//                                Copier
//import android.os.CountDownTimer;import android.widget.TextView;// ...
//
//                        private CountDownTimer countDownTimer;
//
//                        private long totalTimeInMillis = 60000; // Thời gian đếm ngược: 60 giây
//
//                        private TextView timerTextView;@Overrideprotected void onCreate(Bundle savedInstanceState) {    super.onCreate(savedInstanceState);    // Khởi tạo và ánh xạ TextView để hiển thị thời gian đếm ngược
//
//                            timerTextView = findViewById(R.id.timerTextView);
//// Khởi tạo CountDownTimer
//
//                            countDownTimer = new CountDownTimer(totalTimeInMillis, 1000) {        @Override
//
//                            public void onTick(long millisUntilFinished) {            // Tính toán và hiển thị thời gian đếm ngược            long
//                                seconds = millisUntilFinished / 1000;
//
//                                timerTextView.setText("Time remaining: " + seconds + " seconds");        }
//                                @Override        public void onFinish() {            // Xử lý khi thời gian đếm ngược kết thúc            timerTextView.setText("Time's up!");        }
//                                };
//                                // Bắt đầu đếm ngược    countDownTimer.start();
//                            }
//
//
//                            Để đếm tiến thời gian và hiển thị nó lên màn hình trong ứng dụng Android, bạn có thể sử dụng lớp Handler và Runnable để tạo một vòng lặp và cập nhật thời gian sau một khoảng thời gian nhất định. Dưới đây là một ví dụ cách thực hiện điều đó:
//                            1.Trong Activity hoặc Fragment của bạn, khai báo các biến cần thiết:
//                            java
//                                    Copier
//import android.os.Handler;import android.widget.TextView;// ...
//
//                            private Handler handler;
//
//                            private Runnable runnable;
//
//                            private long elapsedTimeInMillis = 0;
//
//                            private TextView timerTextView;
//
//                            @Overrideprotected void onCreate(Bundle savedInstanceState) {
//
//                                super.onCreate(savedInstanceState);    // Khởi tạo và ánh xạ TextView để hiển thị thời gian
//
//                                timerTextView = findViewById(R.id.timerTextView);
//// Khởi tạo Handler    handler = new Handler();    // Khởi tạo Runnable để cập nhật thời gian
//
//                                runnable = new Runnable() {        @Override
//
//                                public void run() {            // Tăng thời gian đã trôi qua
//
//                                    elapsedTimeInMillis += 1000; // Tăng 1 giây (1000 mili giây)            // Tính toán và hiển thị thời gian
//
//                                    long seconds = elapsedTimeInMillis / 1000;
//
//                                    long minutes = seconds / 60;
//
//                                    seconds = seconds % 60;
//
//                                    timerTextView.setText(String.format("%02d:%02d", minutes, seconds));
//
//// Lập lịch chạy lại Runnable sau 1 giây
//
//                                    handler.postDelayed(this, 1000);        }
//
//                                };
//// Bắt đầu đếm thời gian
//
//                                handler.postDelayed(runnable, 1000);}
//                            1.
//                            Trong run() của Runnable, bạn tăng giá trị của elapsedTimeInMillis lên 1000 mili giây (1 giây) và tính toán thời gian đã trôi qua thành phút và giây. Sau đó, bạn cập nhật TextView với thời gian đã tính toán.
//                            2.
//                            3.
//                            Cuối cùng, bạn sử dụng handler.postDelayed(this, 1000) để lập lịch chạy lại Runnable sau 1 giây.
//                            4.
//
//                            Để xử lý sự kiện khi người dùng nhấn nút "Trở về" trên điện thoại (nút Back), bạn có thể ghi đè phương thức onBackPressed() trong Activity của bạn. Dưới đây là một ví dụ cách thực hiện điều đó:
//                            java
//                                    Copier
//                            @Overridepublic void onBackPressed() {    // Xử lý sự kiện khi người dùng nhấn nút "Trở về"    // Gọi super.onBackPressed() để thực hiện hành động trở về mặc định (chẳng hạn đóng Activity)    super.onBackPressed();}
//
//
//                                public void onSensorChanged(SensorEvent event) {        // Xử lý sự kiện thay đổi ánh sáng        float lightValue = event.values[0];                // Thực hiện thay đổi hình nền toàn bộ ứng dụng dựa trên giá trị ánh sáng        changeAppBackground(lightValue);
//                                }
//                                @Override    public void onAccuracyChanged(Sensor sensor, int accuracy) {        // Không cần xử lý trong trường hợp này    }
//                                    private void changeAppBackground(float lightValue) {        // Thay đổi hình nền toàn bộ ứng dụng dựa trên giá trị ánh sáng        // Lưu ý: Đây chỉ là một ví dụ đơn giản, bạn có thể tùy chỉnh phương thức này để thực hiện việc thay đổi hình nền theo ý của mình.        if (lightValue < 100) {            // Ánh sáng yếu, sử dụng hình nền tối            getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.dark_background));        } else {            // Ánh sáng mạnh, sử dụng hình nền sáng            getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.light_background));
//                                    }
//                                }
//                            }
//                            1.Trong MainActivity, ghi đè phương thức onResume() để đăng ký lắng nghe sự thay đổi ánh sáng:
//                            java
//                                    Copier
//import android.hardware.Sensor;import android.hardware.SensorEvent;import android.hardware.SensorEventListener;import android.hardware.SensorManager;import android.os.Bundle;import androidx.appcompat.app.AppCompatActivity;public class MainActivity extends AppCompatActivity implements SensorEventListener {    private SensorManager sensorManager;    private Sensor lightSensor;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//                                // Khởi tạo SensorManager        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//                                // Khởi tạo lightSensor        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
//                            }
//                                @Override    protected void onResume() {        super.onResume();                // Đăng ký lắng nghe sự thay đổi ánh sáng        sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);    }
//                                    @Override    protected void onPause() {        super.onPause();                // Hủy đăng ký lắng nghe sự thay đổi ánh sáng        sensorManager.unregisterListener(this);    }
//                                        @Override    public void onSensorChanged(SensorEvent event) {        // Xử lý sự kiện thay đổi ánh sáng        float lightValue = event.values[0];                // Thực hiện thay đổi hình nền toàn bộ ứng dụng dựa trên giá trị ánh sáng        changeAppBackground(lightValue);
//                                        }
//                                        @Override    public void onAccuracyChanged(Sensor sensor, int accuracy) {        // Không cần xử lý trong trường hợp này    }
//                                            private void changeAppBackground(float lightValue) {        // Thay đổi hình nền toàn bộ ứng dụng dựa trên giá trị ánh sáng        // Lưu ý: Đây chỉ là một ví dụ đơn giản, bạn có thể tùy chỉnh phương thức này để thực hiện việc thay đổi hình nền theo ý của mình.        if (lightValue < 100) {            // Ánh sáng yếu, sử dụng hình nền tối            getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.dark_background));        } else {            // Ánh sáng mạnh, sử dụng hình nền sáng            getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.light_background));
//                                            }
//                                        }
//                                    }
//
//                                    ấy giờ hiện tại khi vào game
//
//                                            Assistant
//                                    Poe
//                                    Để lấy giờ hiện tại khi vào game, bạn có thể sử dụng lớp Calendar trong Java. Dưới đây là một ví dụ cách lấy giờ hiện tại và hiển thị nó trong GameView:
//                                    java
//                                            Copier
//import java.util.Calendar;// Trong lớp GameActivity@Overrideprotected void onResume() {    super.onResume();        // Lấy giờ hiện tại    Calendar calendar = Calendar.getInstance();    int hour = calendar.get(Calendar.HOUR_OF_DAY);    int minute = calendar.get(Calendar.MINUTE);        // Truyền giờ hiện tại vào GameView    gameView.setCurrentTime(hour, minute);
//                                }
//// Trong lớp GameViewprivate int currentHour;private int currentMinute;public void setCurrentTime(int hour, int minute) {    currentHour = hour;
//                                currentMinute = minute;
//                            }
//                            @Overridepublic void draw(Canvas canvas) {    super.draw(canvas);        // Vẽ giờ hiện tại lên canvas    drawCurrentTime(canvas);
//                            }
//                            private void drawCurrentTime(Canvas canvas) {    // Vẽ giờ hiện tại lên canvas, ví dụ:    // canvas.drawText("Current Time: " + currentHour + ":" + currentMinute, x, y, paint);}
//                                Trong phương thức onResume() của GameActivity, chúng ta sử dụng Calendar.getInstance() để lấy một thể hiện của lớp Calendar đại diện cho thời gian hiện tại. Sau đó, chúng ta sử dụng các phương thức get(Calendar.FIELD) để lấy giờ và phút hiện tại từ Calendar và truyền chúng vào GameView bằng phương thức setCurrentTime().
//                                        Trong GameView, chúng ta có biến currentHour và currentMinute để lưu trữ giờ hiện tại. Trong phương thức draw(), chúng ta gọi phương thức drawCurrentTime() để vẽ giờ hiện tại lên 
//                                Canvas. Bạn có thể tùy chỉnh vị trí và kiểu vẽ tùy ý.
//                                lấy ngày giờ thì sao
//
//                                        Assistant
//                                Poe
//                                Để lấy ngày và giờ hiện tại khi vào game, bạn có thể sử dụng lớp Calendar trong Java, tương tự như trong ví dụ trước. Dưới đây là một ví dụ cách lấy ngày và giờ hiện tại và hiển thị chúng trong GameView:
//                                java
//                                        Copier
//import java.util.Calendar;import java.text.SimpleDateFormat;import java.util.Date;// Trong lớp GameActivity@Overrideprotected void onResume() {    super.onResume();        // Lấy ngày và giờ hiện tại    Calendar calendar = Calendar.getInstance();
//                                Date currentDate = calendar.getTime();
//                                // Truyền ngày và giờ hiện tại vào GameView    gameView.setCurrentDateTime(currentDate);
//                            }
//// Trong lớp GameViewprivate Date currentDateTime;public void setCurrentDateTime(Date dateTime) {    currentDateTime = dateTime;
//                        }
//                        @Overridepublic void draw(Canvas canvas) {    super.draw(canvas);        // Vẽ ngày và giờ hiện tại lên canvas    drawCurrentDateTime(canvas);
//                        }
//                        private void drawCurrentDateTime(Canvas canvas) {    // Định dạng ngày và giờ    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");        // Chuyển đổi ngày và giờ thành chuỗi    String currentDate = dateFormat.format(currentDateTime);
//                            String currentTime = timeFormat.format(currentDateTime);
//                            // Vẽ ngày và giờ hiện tại lên canvas, ví dụ:    // canvas.drawText("Current Date: " + currentDate, x, y, paint);    // canvas.drawText("Current Time: " + currentTime, x, y, paint);}
//==> Sai: Khắc Phục
//                            LocalDateTime currentDateTime = LocalDateTime.now();
//                            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
//
//// Chuyển đổi ngày và giờ thành chuỗi
//                            String currentDates = dateFormatter.format(currentDateTime);
//                            String currentTime = timeFormatter.format(currentDateTime);
//
//
//                            canvas.drawText( ""+currentTime+":"+currentDates,screenX / 3f, 100, paint);
//
//
//==> ĐÉm Time
//import java.util.Date;import java.util.Locale;import java.util.concurrent.TimeUnit;// Trong lớp GameViewprivate Handler handler;private long gameTimeInMillis;  // Thời gian chơi tính bằng mili giâyprivate long elapsedTimeInMillis;  // Thời gian đã trôi qua tính bằng mili giây// Phương thức khởi tạopublic GameView(Context context) {    super(context);    // Khởi tạo thời gian chơi và thời gian đã trôi qua    gameTimeInMillis = 60000;  // Ví dụ: 60 giây    elapsedTimeInMillis = 0;        // Khởi tạo Handler và bắt đầu tăng thời gian    handler = new Handler();    startElapsedTime();
//                        }
//                        @Overrideprotected void onDetachedFromWindow() {    super.onDetachedFromWindow();    // Hủy bỏ Handler khi GameView bị loại bỏ    stopElapsedTime();
//                        }
//                        private void startElapsedTime() {    handler.postDelayed(new Runnable() {        @Override        public void run() {            // Tăng thời gian đã trôi qua            elapsedTimeInMillis += 1000;  // Tăng 1 giây (1000 mili giây)            // Vẽ thời gian đã trôi qua lên canvas            drawElapsedTime(canvas);            // Tiếp tục tăng thời gian sau 1 giây            startElapsedTime();
//                        }    }, 1000);  // 1 giây (1000 mili giây)}
//                            private void stopElapsedTime() {    handler.removeCallbacksAndMessages(null);}
//                            private void drawElapsedTime(Canvas canvas) {    // Chuyển đổi thời gian đã trôi qua thành chuỗi có định dạng hh:mm:ss    String elapsedTime = formatElapsedTime(elapsedTimeInMillis);
//                                // Vẽ thời gian đã trôi qua lên canvas, ví dụ:    // canvas.drawText("Elapsed Time: " + elapsedTime, x, y, paint);}
//                                private String formatElapsedTime(long elapsedTimeInMillis) {    // Chia thời gian thành giờ, phút và giây    long hours = TimeUnit.MILLISECONDS.toHours(elapsedTimeInMillis);    long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTimeInMillis) % 60;    long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTimeInMillis) % 60;    // Định dạng giờ, phút và giây thành chuỗi có định dạng hh:mm:ss    String formattedTime = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);    return formattedTime;}
//
//
//                                    vậy sau khi lấy được thời gian theo đsung định dang làm sao so sánh chúng với nhau trong 1 list
//
//                                            Assistant
//                                    Poe
//                                    Để so sánh các thời gian trong một danh sách, bạn có thể sử dụng đối tượng Date hoặc LocalDateTime để biểu diễn thời gian và sử dụng phương thức compareTo() để so sánh chúng.
//                                    Ví dụ, giả sử bạn có một danh sách chứa các thời gian dưới dạng chuỗi có định dạng "hh:mm:ss":
//                                    java
//                                            Copier
//import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.ArrayList;import java.util.Date;import java.util.List;public class Main {    public static void main(String[] args) {        List<String> timeStrings = new ArrayList<>();        timeStrings.add("08:30:00");        timeStrings.add("12:45:00");        timeStrings.add("06:15:00");                // Định dạng cho SimpleDateFormat        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");                try {            // Chuyển đổi chuỗi thời gian thành đối tượng Date và lưu vào danh sách mới            List<Date> times = new ArrayList<>();            for (String timeString : timeStrings) {                Date time = timeFormat.parse(timeString);
//                                        times.add(time);
//                                    }
//                                        // So sánh các thời gian trong danh sách            Date firstTime = times.get(0);            Date secondTime = times.get(1);                        if (firstTime.compareTo(secondTime) < 0) {                System.out.println("First time is earlier than second time.");            } else if (firstTime.compareTo(secondTime) > 0) {                System.out.println("First time is later than second time.");            } else {                System.out.println("First time is equal to second time.");            }
//                                    } catch (ParseException e) {            e.printStackTrace();
//                                    }
//                                }
//                            }
//                            Trong ví dụ này, chúng ta sử dụng SimpleDateFormat để chuyển đổi chuỗi thời gian thành đối tượng Date. Sau đó, chúng ta có thể sử dụng phương thức compareTo() của đối tượng Date để so sánh hai thời gian. Kết quả của phương thức compareTo() là một số nguyên âm nếu thời gian đầu tiên nhỏ hơn thời gian thứ hai, số nguyên dương nếu thời gian đầu tiên lớn hơn thời gian thứ hai, và 0 nếu hai thời gian bằng nhau.
//                            Lưu ý rằng trong ví dụ này, chúng ta giả định rằng các chuỗi thời gian đầu vào đúng định dạng và không có lỗi. Bạn cần đảm bảo rằng các chuỗi thời gian trong danh sách của bạn đúng định dạng và không có lỗi trước khi chuyển đổi chúng thành đối tượng Date.
//                                    tìm người chơi lâu nhất
//
//                            Assistant
//                                    Poe
//                            Để tìm người chơi đã chơi lâu nhất trong một danh sách người chơi, bạn cần so sánh thời gian chơi của từng người chơi và tìm người chơi với thời gian chơi lớn nhất. Dưới đây là một ví dụ về cách làm điều đó:
//                            java
//                                    Copier
//import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.ArrayList;import java.util.Date;import java.util.List;public class Main {    public static void main(String[] args) {        List<Player> players = new ArrayList<>();                // Thêm các người chơi vào danh sách        players.add(new Player("John", "01:15:30"));        players.add(new Player("Emma", "02:30:45"));        players.add(new Player("David", "01:45:15"));                // Tìm người chơi chơi lâu nhất        Player longestPlayingPlayer = findLongestPlayingPlayer(players);
//                                // In thông tin người chơi chơi lâu nhất        if (longestPlayingPlayer != null) {            System.out.println("Longest playing player: " + longestPlayingPlayer.getName());            System.out.println("Play time: " + longestPlayingPlayer.getPlayTime());        } else {            System.out.println("No players found.");        }
//                            }
//                                private static Player findLongestPlayingPlayer(List<Player> players) {        Player longestPlayingPlayer = null;        long maxPlayTimeInMillis = 0;                for (Player player : players) {            long playTimeInMillis = player.getPlayTimeInMillis();                        if (playTimeInMillis > maxPlayTimeInMillis) {                maxPlayTimeInMillis = playTimeInMillis;
//                                    longestPlayingPlayer = player;
//                                }
//                                }
//                                    return longestPlayingPlayer;    }
//                            }
//                            class Player {    private String name;    private String playTime;        public Player(String name, String playTime) {        this.name = name;        this.playTime = playTime;    }
//                                public String getName() {        return name;    }
//                                public String getPlayTime() {        return playTime;    }
//                                public long getPlayTimeInMillis() {        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");                try {            Date playTimeDate = timeFormat.parse(playTime);            return playTimeDate.getTime();        } catch (ParseException e) {            e.printStackTrace();
//                                }
//                                    return 0;    }
//                            }
//                            Trong ví dụ này, chúng ta có một lớp Player để đại diện cho mỗi người chơi, với các thuộc tính name (tên người chơi) và playTime (thời gian chơi). Chúng ta cũng có một phương thức getPlayTimeInMillis() trong lớp Player để chuyển đổi thời gian chơi từ chuỗi thành mili giây.
//                                    Trong phương thức findLongestPlayingPlayer(), chúng ta lặp qua danh sách người chơi và so sánh thời gian chơi của từng người chơi. Nếu thời gian chơi của một người chơi lớn hơn thời gian chơi lớn nhất hiện tại, chúng ta cập nhật người chơi chơi lâu nhất và thời gian chơi lớn nhất.
//                            Cuối cùng, chúng ta in thông tin của người chơi chơi lâu nhất nếu tồn tại người chơi đó.
//                            sắp xếp danh sách từ người chơi lâu nhất
//
//                                    Assistant
//                            Poe
//                            Để sắp xếp danh sách người chơi theo thời gian chơi lâu nhất, bạn có thể sử dụng giao thức Comparable hoặc 
//                            Comparator trong Java. Dưới đây là một ví dụ sử dụng Comparator để sắp xếp danh sách người chơi theo thời gian chơi giảm dần:
//                            java
//                                    Copier
//import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.ArrayList;import java.util.Collections;import java.util.Comparator;import java.util.Date;import java.util.List;public class Main {    public static void main(String[] args) {        List<Player> players = new ArrayList<>();                // Thêm các người chơi vào danh sách        players.add(new Player("John", "01:15:30"));        players.add(new Player("Emma", "02:30:45"));        players.add(new Player("David", "01:45:15"));                // Sắp xếp danh sách người chơi theo thời gian chơi giảm dần        Collections.sort(players, new PlayerComparator());                // In danh sách người chơi đã sắp xếp        for (Player player : players) {            System.out.println("Name: " + player.getName());            System.out.println("Play time: " + player.getPlayTime());            System.out.println();
//                            }
//                            }
//                        }
//                        class Player {    private String name;    private String playTime;        public Player(String name, String playTime) {        this.name = name;        thisplayTime = playTime;
//                        }
//                            public String getName() {        return name;    }
//                            public String getPlayTime() {        return playTime;    }
//                            public long getPlayTimeInMillis() {        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");                try {            Date playTimeDate = timeFormat.parse(playTime);            return playTimeDate.getTime();        } catch (ParseException e) {            e.printStackTrace();
//                            }
//                                return 0;    }
//                        }
//                        class PlayerComparator implements Comparator<Player> {    @Override    public int compare(Player player1, Player player2) {        long playTime1 = player1.getPlayTimeInMillis();        long playTime2 = player2.getPlayTimeInMillis();                // Sắp xếp giảm dần theo thời gian chơi        if (playTime1 > playTime2) {            return -1;        } else if (playTime1 < playTime2) {            return 1;        } else {            return 0;        }
//                        }
//                        }
//                        Trong ví dụ này, chúng ta tạo một lớp PlayerComparator thực hiện giao thức Comparator và ghi đè phương thức compare() để so sánh hai người chơi dựa trên thời gian chơi của họ. Chúng ta sắp xếp danh sách players bằng cách sử dụng 
//                        Collections.sort() và truyền PlayerComparator làm tham số.
//                                Sau đó, chúng ta lặp qua danh sách người chơi đã sắp xếp và in thông tin của từng người chơi.
//                        Kết quả đầu ra sẽ là danh sách người chơi đã được sắp xếp theo thời gian chơi giảm dần.
//                        tìm kiếm thời gian từ x đến y nhập vào từ view
//
//                        Assistant
//                                Poe
//                        Để tìm kiếm người chơi có thời gian chơi trong khoảng từ x đến y, bạn cần nhập các giá trị x và y từ view, sau đó so sánh thời gian chơi của từng người chơi với khoảng thời gian x và y. Dưới đây là một ví dụ về cách thực hiện điều đó:
//                        java
//                                Copier
//import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.ArrayList;import java.util.List;public class Main {    public static void main(String[] args) {        List<Player> players = new ArrayList<>();                // Thêm các người chơi vào danh sách        players.add(new Player("John", "01:15:30"));        players.add(new Player("Emma", "02:30:45"));        players.add(new Player("David", "01:45:15"));                // Giả sử x và y là thời gian chơi nhập từ view        String x = "01:00:00";        String y = "02:00:00";                // Tìm kiếm người chơi có thời gian chơi từ x đến y        List<Player> playersWithinRange = findPlayersWithinTimeRange(players, x, y);
//                            // In danh sách người chơi trong khoảng thời gian        if (!playersWithinRange.isEmpty()) {            System.out.println("Players within time range " + x + " - " + y + ":");            for (Player player : playersWithinRange) {                System.out.println("Name: " + player.getName());                System.out.println("Play time: " + player.getPlayTime());                System.out.println();
//                        }        } else {            System.out.println("No players found within the specified time range.");        }
//                    }
//                        private static List<Player> findPlayersWithinTimeRange(List<Player> players, String startTime, String endTime) {        List<Player> playersWithinRange = new ArrayList<>();        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");                try {            long startMillis = timeFormat.parse(startTime).getTime();            long endMillis = timeFormat.parse(endTime).getTime();                        for (Player player : players) {                long playTimeMillis = player.getPlayTimeInMillis();                                if (playTimeMillis >= startMillis && playTimeMillis <= endMillis) {                    playersWithinRange.add(player);
//                        }
//                        }        } catch (ParseException e) {            e.printStackTrace();
//                        }
//                            return playersWithinRange;    }
//                    }
//                    class Player {    private String name;    private String playTime;        public Player(String name, String playTime) {        this.name = name;        this.playTime = playTime;    }
//                        public String getName() {        return name;    }
//                        public String getPlayTime() {        return playTime;    }
//                        public long getPlayTimeInMillis() {        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");                try {            return timeFormat.parse(playTime).getTime();        } catch (ParseException e) {            e.printStackTrace();
//                        }
//                            return 0;    }
//                    }
//
//
//                    ý tôi là khoi ấn ra khỏi màn hình phải không thừc hiện việc ấn và hiện dialog cảng báo luôn
//
//                            Assistant
//                    Poe
//                    Ah, hiểu rồi. Để khi người dùng thoát khỏi màn hình (ấn ra bên ngoài) thì tự động hiển thị dialog cảnh báo, bạn có thể sử dụng phương thức setOnTouchListener để lắng nghe sự kiện chạm màn hình và kiểm tra nếu người dùng chạm bên ngoài màn hình, thì hiển thị dialog cảnh báo.
//                    Dưới đây là một ví dụ về cách thực hiện điều đó trong môi trường Android, sử dụng Java:
//                    java
//                            Copier
//import android.app.AlertDialog;import android.content.DialogInterface;import android.os.Bundle;import android.support.v7.app.AppCompatActivity;import android.view.MotionEvent;import android.view.View;public class MainActivity extends AppCompatActivity {    private boolean isDialogShown = false;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//
//                        View rootView = findViewById(android.R.id.content);        rootView.setOnTouchListener(new View.OnTouchListener() {            @Override            public boolean onTouch(View v, MotionEvent event) {                if (!isDialogShown) {                    showDialog();
//                        }                return true;            }
//                        });
//                    }
//                        private void showDialog() {        isDialogShown = true;        AlertDialog.Builder builder = new AlertDialog.Builder(this);        builder.setTitle("Cảnh báo");        builder.setMessage("Bạn đã ấn ra khỏi màn hình!");        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {            @Override            public void onClick(DialogInterface dialog, int which) {                dialog.dismiss();
//                        }
//                        });
//
//                            AlertDialog dialog = builder.create();        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {            @Override            public void onDismiss(DialogInterface dialog) {                isDialogShown = false;            }
//                            });
//                            dialog.show();
//                        }
//                    }
//
//
//                    khi ấn mutitask hiện dialog cảnh báo và đồng thời không thoát ra ngoiaf
//
//                    Assistant
//                            Poe
//                    Để hiển thị dialog cảnh báo khi người dùng ấn nút Multitasking (Recent Apps) mà không thoát khỏi ứng dụng, bạn cần gắn lắng nghe sự kiện khi nút này được ấn và xử lý nó một cách đặc biệt. Dưới đây là một ví dụ về cách thực hiện điều đó trong môi trường Android, sử dụng Java:
//                    java
//                            Copier
//import android.app.AlertDialog;import android.content.DialogInterface;import android.os.Bundle;import android.support.v7.app.AppCompatActivity;import android.view.KeyEvent;import android.view.WindowManager;public class MainActivity extends AppCompatActivity {    private boolean isDialogShown = false;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//                        // Lắng nghe sự kiện khi nút Multitasking được ấn        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
//                        getWindow().setFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
//                    }
//                        @Override    public boolean onKeyDown(int keyCode, KeyEvent event) {        if (keyCode == KeyEvent.KEYCODE_APP_SWITCH) {            showAlertDialog();            return true; // Ngăn chặn sự kiện mặc định của nút Multitasking        }        return super.onKeyDown(keyCode, event);    }
//                            private void showAlertDialog() {        if (!isDialogShown) {            isDialogShown = true;            AlertDialog.Builder builder = new AlertDialog.Builder(this);            builder.setTitle("Cảnh báo");            builder.setMessage("Bạn đã ấn Multitasking!");            builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {                @Override                public void onClick(DialogInterface dialog, int which) {                    dialog.dismiss();                    isDialogShown = false;                }
//                            });
//
//                                AlertDialog dialog = builder.create();
//                                dialog.show();
//                            }
//                            }
//                        }
//
//
//                            ý tôi là khoi ấn ra khỏi màn hình phải không thừc hiện việc ấn và hiện dialog cảng báo luôn
//
//                                    Assistant
//                            Poe
//                            Ah, hiểu rồi. Để khi người dùng thoát khỏi màn hình (ấn ra bên ngoài) thì tự động hiển thị dialog cảnh báo, bạn có thể sử dụng phương thức setOnTouchListener để lắng nghe sự kiện chạm màn hình và kiểm tra nếu người dùng chạm bên ngoài màn hình, thì hiển thị dialog cảnh báo.
//                                    Dưới đây là một ví dụ về cách thực hiện điều đó trong môi trường Android, sử dụng Java:
//                            java
//                                    Copier
//import android.app.AlertDialog;import android.content.DialogInterface;import android.os.Bundle;import android.support.v7.app.AppCompatActivity;import android.view.MotionEvent;import android.view.View;public class MainActivity extends AppCompatActivity {    private boolean isDialogShown = false;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//
//                                View rootView = findViewById(android.R.id.content);        rootView.setOnTouchListener(new View.OnTouchListener() {            @Override            public boolean onTouch(View v, MotionEvent event) {                if (!isDialogShown) {                    showDialog();
//                                }                return true;            }
//                                });
//                            }
//                                private void showDialog() {        isDialogShown = true;        AlertDialog.Builder builder = new AlertDialog.Builder(this);        builder.setTitle("Cảnh báo");        builder.setMessage("Bạn đã ấn ra khỏi màn hình!");        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {            @Override            public void onClick(DialogInterface dialog, int which) {                dialog.dismiss();
//                                }
//                                });
//
//                                    AlertDialog dialog = builder.create();        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {            @Override            public void onDismiss(DialogInterface dialog) {                isDialogShown = false;            }
//                                    });
//                                    dialog.show();
//                                }
//                            }

    //---Sang
    //thay đổi background khi cảm biến ánh sáng thay đổi
    //
    //Assistant
    //Assistant
    //
    //Poe
    //Để thay đổi background khi cảm biến ánh sáng thay đổi, bạn có thể sử dụng cảm biến ánh sáng (Light Sensor) và lắng nghe sự thay đổi giá trị của nó. Dựa vào giá trị của cảm biến ánh sáng, bạn có thể thay đổi background của một thành phần View (ví dụ: một Layout, một ImageView, v.v.). Dưới đây là một ví dụ minh họa:
    //
    //Đầu tiên, hãy chắc chắn rằng bạn đã thêm quyền truy cập cảm biến ánh sáng vào tệp AndroidManifest.xml:
    //xml
    //Copier
    //<uses-permission android:name="android.permission.INTERNET" />
    //Tiếp theo, tạo một Activity hoặc Fragment trong ứng dụng Android và thêm mã sau vào để lắng nghe và xử lý sự thay đổi của cảm biến ánh sáng:
    //java
    //Copier
    //import android.content.Context;
    //import android.hardware.Sensor;
    //import android.hardware.SensorEvent;
    //import android.hardware.SensorEventListener;
    //import android.hardware.SensorManager;
    //import android.os.Bundle;
    //import android.support.v7.app.AppCompatActivity;
    //import android.view.View;
    //
    //public class MainActivity extends AppCompatActivity implements SensorEventListener {
    //    private SensorManager sensorManager;
    //    private Sensor lightSensor;
    //    private View rootView;
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_main);
    //
    //        rootView = findViewById(android.R.id.content);
    //        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    //        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    //    }
    //
    //    @Override
    //    protected void onResume() {
    //        super.onResume();
    //        sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);
    //    }
    //
    //    @Override
    //    protected void onPause() {
    //        super.onPause();
    //        sensorManager.unregisterListener(this);
    //    }
    //
    //    @Override
    //    public void onSensorChanged(SensorEvent event) {
    //        float lightValue = event.values[0];
    //
    //        // Thực hiện logic để thay đổi background dựa vào giá trị cảm biến ánh sáng
    //        if (lightValue < 10) {
    //            rootView.setBackgroundColor(getResources().getColor(android.R.color.black));
    //        } else {
    //            rootView.setBackgroundColor(getResources().getColor(android.R.color.white));
    //        }
    //    }
    //
    //    @Override
    //    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    //        // Không cần xử lý trong ví dụ này
    //    }
    //}
    //Trong ví dụ trên, chúng ta sử dụng SensorManager để lấy đối tượng SensorManager và lightSensor để lấy đối tượng cảm biến ánh sáng từ hệ thống. Trong phương thức onCreate(), chúng ta lấy tham chiếu đến view gốc (rootView) của Activity hoặc Fragment, mà chúng ta muốn thay đổi background của nó.
    //
    //Trong phương thức onResume(), chúng ta đăng ký lắng nghe sự kiện từ cảm biến ánh sáng bằng cách gọi sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL).
    //
    //Trong phương thức onPause(), chúng ta hủy đăng ký lắng nghe sự kiện từ cảm biến ánh sáng bằng cách gọi sensorManager.unregisterListener(this) để giải phóng tài nguyên.
    //
    //Trong phương thức onSensorChanged(), chúng ta nhận giá trị ánh sáng từ sự kiện cảm biến và thực hiện logic để thay đổi background dựa trên giá trị đó. Trong ví dụ này, nếu giá trị ánh sáng nhỏ hơn 10, chúng ta thay đổi background thành màu đen, ngược lại, chúng ta thay đổi background thành màu trắng.
    //
    //Phần mã trên giả định rằng bạn đã tạo một tệp activity_main.xml chứa giao diện của Activity hoặc Fragment của bạn. Bạn cóthể tạo một tệp XML với tên activity_main.xml và chèn các thành phần UI của bạn vào đó. Sau đó, trong phần mã Java, hãy thay đổi R.layout.activity_main thành ID tương ứng với tệp XML của bạn.
    //
    //tạo fragment có swith nếu gạt sang thì thay đổi hình nền của app
    //
    //Assistant
    //Assistant
    //
    //Poe
    //
    //Để tạo một Fragment có một Switch và thay đổi hình nền của ứng dụng dựa trên trạng thái của Switch, bạn có thể làm như sau:
    //
    //Tạo một tệp XML cho giao diện của Fragment (ví dụ: fragment_settings.xml) và thêm một Switch và một thành phần UI khác (ví dụ: Button) cho việc thay đổi hình nền:
    //xml
    //Copier
    //<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    //    android:layout_width="match_parent"
    //    android:layout_height="match_parent"
    //    android:orientation="vertical">
    //
    //    <Switch
    //        android:id="@+id/switchBackground"
    //        android:layout_width="wrap_content"
    //        android:layout_height="wrap_content"
    //        android:text="Thay đổi hình nền" />
    //
    //    <Button
    //        android:id="@+id/buttonChangeBackground"
    //        android:layout_width="wrap_content"
    //        android:layout_height="wrap_content"
    //        android:text="Thay đổi" />
    //
    //</LinearLayout>
    //Tạo một Fragment (ví dụ: SettingsFragment) và lắng nghe sự kiện của Switch và Button để thay đổi hình nền. Dưới đây là một ví dụ minh họa:
    //java
    //Copier
    //import android.content.Context;
    //import android.content.SharedPreferences;
    //import android.graphics.Color;
    //import android.os.Bundle;
    //import android.preference.PreferenceManager;
    //import android.support.annotation.NonNull;
    //import android.support.annotation.Nullable;
    //import android.support.v4.app.Fragment;
    //import android.view.LayoutInflater;
    //import android.view.View;
    //import android.view.ViewGroup;
    //import android.widget.Button;
    //import android.widget.Switch;
    //
    //public class SettingsFragment extends Fragment {
    //
    //    private Switch switchBackground;
    //    private Button buttonChangeBackground;
    //    private SharedPreferences sharedPreferences;
    //
    //    @Override
    //    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    //        View view = inflater.inflate(R.layout.fragment_settings, container, false);
    //
    //        switchBackground = view.findViewById(R.id.switchBackground);
    //        buttonChangeBackground = view.findViewById(R.id.buttonChangeBackground);
    //
    //        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
    //        boolean isBackgroundChanged = sharedPreferences.getBoolean("isBackgroundChanged", false);
    //        switchBackground.setChecked(isBackgroundChanged);
    //
    //        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
    //            SharedPreferences.Editor editor = sharedPreferences.edit();
    //            editor.putBoolean("isBackgroundChanged", isChecked);
    //            editor.apply();
    //        });
    //
    //        buttonChangeBackground.setOnClickListener(v -> {
    //            boolean isBackgroundChanged = sharedPreferences.getBoolean("isBackgroundChanged", false);
    //            int backgroundColor = isBackgroundChanged ? Color.RED : Color.BLUE;
    //            getView().setBackgroundColor(backgroundColor);
    //        });
    //
    //        return view;
    //    }
    //}
    //Trong ví dụ trên, chúng ta sử dụng SharedPreferences để lưu trạng thái của Switch (nên hình nền đã được thay đổi hay chưa). Khi Fragment được tạo, chúng ta kiểm tra giá trị trong SharedPreferences và đặt trạng thái của Switch dựa trên giá trị đó.
    //
    //Sau đó, chúng ta lắng nghe sự kiện thay đổi của Switch bằng cách sử dụng phương thức setOnCheckedChangeListener() và lưu trạng thái mới vào SharedPreferences khi Switch thay đổi.
    //
    //Khi Button "Thay đổi" được nhấn, chúng ta kiểm tra giá trị trong SharedPreferences để xác định xem hình nền đã được thay đổi hay chưa. Dựa trên giá trị đó, chúng ta thiết lập màu nền của Fragment bằng cách sử dụng phương thức setBackgroundColor().
    //
    //Lưu ý rằng trong ví dụ trên, chúng ta sử dụng SharedPreferences để lưu trạng thái của Switch và sử dụng getView().setBackgroundColor() để thay đổi màu nền của Fragment. Tuy nhiên, trong ứng dụng thực tế, bạn có thể áp dụng thay đổi hình nền cho toàn bộ ứng dụng bằng cách sử dụng các phương pháp và công cụ tương ứng.
//
//         */
//    }

    /*
    Cập nhật hồ sơ của người dùng
Bạn có thể cập nhật thông tin hồ sơ cơ bản của người dùng—tên hiển thị và URL ảnh hồ sơ của người dùng—bằng phương thức updateProfile . Ví dụ:

Kotlin+KTX
Java

FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
        .setDisplayName("Jane Q. User")
        .setPhotoUri(Uri.parse("https://example.com/jane-q-user/profile.jpg"))
        .build();

user.updateProfile(profileUpdates)
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "User profile updated.");
                }
            }
        });


Bạn có thể đặt địa chỉ email của người dùng bằng phương thức updateEmail . Ví dụ:

Kotlin+KTX
Java

FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

user.updateEmail("user@example.com")
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "User email address updated.");
                }
            }
        });

Đặt mật khẩu của người dùng
Bạn có thể đặt mật khẩu của người dùng bằng phương thức updatePassword . Ví dụ:

Kotlin+KTX
Java

FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
String newPassword = "SOME-SECURE-PASSWORD";

user.updatePassword(newPassword)
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "User password updated.");
                }
            }
        });

        Xóa người dùng
Bạn có thể xóa tài khoản người dùng bằng phương thức delete . Ví dụ:

Kotlin+KTX
Java

FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

user.delete()
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "User account deleted.");
                }
            }
        });

        Xác thực lại người dùng
Một số hành động nhạy cảm về bảo mật—chẳng hạn như xóa tài khoản , đặt địa chỉ email chính và thay đổi mật khẩu —yêu cầu người dùng phải đăng nhập gần đây. Nếu bạn thực hiện một trong những hành động này và người dùng đã đăng nhập cách đây quá lâu, hành động không thành công và ném FirebaseAuthRecentLoginRequiredException . Khi điều này xảy ra, hãy xác thực lại người dùng bằng cách lấy thông tin xác thực đăng nhập mới từ người dùng và chuyển thông tin xác thực tới reauthenticate thực lại . Ví dụ:

Kotlin+KTX
Java

FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

// Get auth credentials from the user for re-authentication. The example below shows
// email and password credentials but there are multiple possible providers,
// such as GoogleAuthProvider or FacebookAuthProvider.
AuthCredential credential = EmailAuthProvider
        .getCredential("user@example.com", "password1234");

// Prompt the user to re-provide their sign-in credentials
user.reauthenticate(credential)
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Log.d(TAG, "User re-authenticated.");
            }
        });

     */

    /*
    Đọc và ghi dữ liệu trên Android

bookmark_border
Tài liệu này trình bày những kiến ​​thức cơ bản về đọc và ghi dữ liệu Firebase.

Dữ liệu Firebase được ghi vào tham chiếu FirebaseDatabase và được truy xuất bằng cách đính kèm trình nghe không đồng bộ vào tham chiếu. Trình nghe được kích hoạt một lần đối với trạng thái ban đầu của dữ liệu và một lần nữa bất cứ khi nào dữ liệu thay đổi.

Lưu ý: Theo mặc định, quyền truy cập đọc và ghi vào cơ sở dữ liệu của bạn bị hạn chế nên chỉ những người dùng được xác thực mới có thể đọc hoặc ghi dữ liệu. Để bắt đầu mà không cần thiết lập Xác thực , bạn có thể định cấu hình các quy tắc của mình để truy cập công khai . Điều này làm cho cơ sở dữ liệu của bạn mở cho bất kỳ ai, ngay cả những người không sử dụng ứng dụng của bạn, vì vậy hãy đảm bảo hạn chế lại cơ sở dữ liệu của bạn khi bạn thiết lập xác thực.
(Tùy chọn) Nguyên mẫu và thử nghiệm với Bộ mô phỏng cục bộ Firebase
Trước khi nói về cách ứng dụng của bạn đọc và ghi vào Cơ sở dữ liệu thời gian thực, hãy giới thiệu một bộ công cụ bạn có thể sử dụng để tạo nguyên mẫu và kiểm tra chức năng Cơ sở dữ liệu thời gian thực: Bộ mô phỏng cục bộ Firebase. Nếu bạn đang thử các mô hình dữ liệu khác nhau, tối ưu hóa các quy tắc bảo mật hoặc nỗ lực tìm ra cách hiệu quả nhất về mặt chi phí để tương tác với back-end, thì việc có thể làm việc cục bộ mà không cần triển khai các dịch vụ trực tiếp có thể là một ý tưởng tuyệt vời.

Trình mô phỏng cơ sở dữ liệu thời gian thực là một phần của Bộ mô phỏng cục bộ, cho phép ứng dụng của bạn tương tác với nội dung và cấu hình cơ sở dữ liệu được mô phỏng cũng như các tài nguyên dự án được mô phỏng (chức năng, cơ sở dữ liệu khác và quy tắc bảo mật) của bạn.

Sử dụng trình mô phỏng Cơ sở dữ liệu thời gian thực chỉ bao gồm một vài bước:

Thêm một dòng mã vào cấu hình thử nghiệm của ứng dụng để kết nối với trình mô phỏng.
Từ thư mục gốc của thư mục dự án cục bộ của bạn, hãy chạy firebase emulators:start .
Thực hiện lệnh gọi từ mã nguyên mẫu của ứng dụng bằng cách sử dụng SDK nền tảng Cơ sở dữ liệu thời gian thực như bình thường hoặc sử dụng API REST của cơ sở dữ liệu thời gian thực.
Hiện có sẵn hướng dẫn chi tiết liên quan đến Cơ sở dữ liệu thời gian thực và Chức năng đám mây . Bạn cũng nên xem phần giới thiệu Local Emulator Suite .

Nhận một tài liệu tham khảo cơ sở dữ liệu
Để đọc hoặc ghi dữ liệu từ cơ sở dữ liệu, bạn cần một phiên bản của DatabaseReference :

Kotlin+KTX
Java

private DatabaseReference mDatabase;
// ...
mDatabase = FirebaseDatabase.getInstance().getReference();
Ghi dữ liệu
Các thao tác ghi cơ bản
Đối với các thao tác ghi cơ bản, bạn có thể sử dụng setValue() để lưu dữ liệu vào một tham chiếu đã chỉ định, thay thế mọi dữ liệu hiện có tại đường dẫn đó. Bạn có thể sử dụng phương pháp này để:

Các loại pass tương ứng với các loại JSON có sẵn như sau:
String
Long
Double
Boolean
Map<String, Object>
List<Object>
Truyền một đối tượng Java tùy chỉnh, nếu lớp định nghĩa nó có hàm tạo mặc định không nhận đối số và có các getter công khai cho các thuộc tính được gán.
Nếu bạn sử dụng một đối tượng Java, nội dung của đối tượng của bạn sẽ tự động được ánh xạ tới các vị trí con theo kiểu lồng nhau. Việc sử dụng một đối tượng Java cũng thường làm cho mã của bạn dễ đọc hơn và dễ bảo trì hơn. Ví dụ: nếu bạn có một ứng dụng có hồ sơ người dùng cơ bản, đối tượng User của bạn có thể trông như sau:

Kotlin+KTX
Java

@IgnoreExtraProperties
data class User(val username: String? = null, val email: String? = null) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}
Bạn có thể thêm người dùng bằng setValue() như sau:

Kotlin+KTX
Java

fun writeNewUser(userId: String, name: String, email: String) {
    val user = User(name, email)

    database.child("users").child(userId).setValue(user)
}
Sử dụng setValue() theo cách này sẽ ghi đè dữ liệu tại vị trí đã chỉ định, bao gồm mọi nút con. Tuy nhiên, bạn vẫn có thể cập nhật một đối tượng con mà không cần viết lại toàn bộ đối tượng. Nếu bạn muốn cho phép người dùng cập nhật hồ sơ của họ, bạn có thể cập nhật tên người dùng như sau:

Kotlin+KTX
Java

database.child("users").child(userId).child("username").setValue(name)
Đọc dữ liệu
Đọc dữ liệu với người nghe liên tục
Để đọc dữ liệu tại một đường dẫn và lắng nghe các thay đổi, hãy sử dụng phương thức addValueEventListener() để thêm ValueEventListener vào DatabaseReference .

Người nghe	Gọi lại sự kiện	Cách sử dụng điển hình
ValueEventListener	onDataChange()	Đọc và lắng nghe những thay đổi đối với toàn bộ nội dung của đường dẫn.
Bạn có thể sử dụng phương thức onDataChange() để đọc ảnh chụp nhanh tĩnh của nội dung tại một đường dẫn nhất định, vì chúng tồn tại tại thời điểm xảy ra sự kiện. Phương thức này được kích hoạt một lần khi người nghe được đính kèm và lặp lại mỗi khi dữ liệu, bao gồm cả dữ liệu con, thay đổi. Lệnh gọi lại sự kiện được chuyển qua ảnh chụp nhanh chứa tất cả dữ liệu tại vị trí đó, bao gồm cả dữ liệu con. Nếu không có dữ liệu, ảnh chụp nhanh sẽ trả về false khi bạn gọi exists() và null khi bạn gọi getValue() trên đó.

Quan trọng: Phương thức onDataChange() được gọi mỗi khi dữ liệu được thay đổi tại tham chiếu cơ sở dữ liệu đã chỉ định, bao gồm cả những thay đổi đối với con. Để giới hạn kích thước ảnh chụp nhanh của bạn, chỉ đính kèm ở mức cao nhất cần thiết để xem các thay đổi. Ví dụ: không nên gắn trình nghe vào thư mục gốc của cơ sở dữ liệu của bạn.
Ví dụ sau minh họa một ứng dụng viết blog xã hội truy xuất thông tin chi tiết của một bài đăng từ cơ sở dữ liệu:

Kotlin+KTX
Java

val postListener = object : ValueEventListener {
    override fun onDataChange(dataSnapshot: DataSnapshot) {
        // Get Post object and use the values to update the UI
        val post = dataSnapshot.getValue<Post>()
        // ...
    }

    override fun onCancelled(databaseError: DatabaseError) {
        // Getting Post failed, log a message
        Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
    }
}
postReference.addValueEventListener(postListener)
Trình nghe nhận được một DataSnapshot chứa dữ liệu tại vị trí được chỉ định trong cơ sở dữ liệu tại thời điểm xảy ra sự kiện. Việc gọi getValue() trên ảnh chụp nhanh sẽ trả về biểu diễn đối tượng Java của dữ liệu. Nếu không có dữ liệu tồn tại tại vị trí đó, việc gọi getValue() sẽ trả về null .

Trong ví dụ này, ValueEventListener cũng định nghĩa phương thức onCancelled() sẽ được gọi nếu quá trình đọc bị hủy. Ví dụ: quá trình đọc có thể bị hủy nếu khách hàng không có quyền đọc từ vị trí cơ sở dữ liệu Firebase. Phương thức này được truyền một đối tượng DatabaseError cho biết lý do xảy ra lỗi.

Đọc dữ liệu một lần
Đọc một lần bằng get()
SDK được thiết kế để quản lý các tương tác với máy chủ cơ sở dữ liệu cho dù ứng dụng của bạn trực tuyến hay ngoại tuyến.

Nói chung, bạn nên sử dụng các kỹ thuật ValueEventListener được mô tả ở trên để đọc dữ liệu nhằm nhận thông báo về các cập nhật dữ liệu từ chương trình phụ trợ. Kỹ thuật nghe giúp giảm mức sử dụng và thanh toán của bạn, đồng thời được tối ưu hóa để mang lại cho người dùng trải nghiệm tốt nhất khi họ trực tuyến và ngoại tuyến.

Nếu bạn chỉ cần dữ liệu một lần, bạn có thể sử dụng get() để lấy ảnh chụp nhanh dữ liệu từ cơ sở dữ liệu. Nếu vì bất kỳ lý do nào get() không thể trả về giá trị máy chủ, máy khách sẽ thăm dò bộ đệm lưu trữ cục bộ và trả về lỗi nếu vẫn không tìm thấy giá trị.

Việc sử dụng get() không cần thiết có thể làm tăng mức sử dụng băng thông và dẫn đến giảm hiệu suất, điều này có thể được ngăn chặn bằng cách sử dụng trình nghe thời gian thực như minh họa ở trên.

Kotlin+KTX
Java

mDatabase.child("users").child(userId).get().addOnSuccessListener {
    Log.i("firebase", "Got value ${it.value}")
}.addOnFailureListener{
    Log.e("firebase", "Error getting data", it)
}
Đọc một lần bằng cách sử dụng trình nghe
Trong một số trường hợp, bạn có thể muốn giá trị từ bộ đệm cục bộ được trả về ngay lập tức thay vì kiểm tra giá trị cập nhật trên máy chủ. Trong những trường hợp đó, bạn có thể sử dụng addListenerForSingleValueEvent để lấy dữ liệu từ bộ đệm đĩa cục bộ ngay lập tức.

Điều này hữu ích đối với dữ liệu chỉ cần tải một lần và dự kiến ​​sẽ không thay đổi thường xuyên hoặc yêu cầu lắng nghe tích cực. Ví dụ: ứng dụng viết blog trong các ví dụ trước sử dụng phương pháp này để tải hồ sơ của người dùng khi họ bắt đầu viết một bài đăng mới.

Cập nhật hoặc xóa dữ liệu
Cập nhật các trường cụ thể
Để ghi đồng thời vào các nút con cụ thể của một nút mà không ghi đè lên các nút con khác, hãy sử dụng phương thức updateChildren() .

Khi gọi updateChildren() , bạn có thể cập nhật các giá trị con cấp thấp hơn bằng cách chỉ định đường dẫn cho khóa. Nếu dữ liệu được lưu trữ ở nhiều vị trí để mở rộng quy mô tốt hơn, bạn có thể cập nhật tất cả các phiên bản của dữ liệu đó bằng cách sử dụng phân xuất dữ liệu . Ví dụ: một ứng dụng viết blog xã hội có thể có lớp Post như thế này:

Kotlin+KTX
Java

@IgnoreExtraProperties
data class Post(
    var uid: String? = "",
    var author: String? = "",
    var title: String? = "",
    var body: String? = "",
    var starCount: Int = 0,
    var stars: MutableMap<String, Boolean> = HashMap(),
) {

    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "uid" to uid,
            "author" to author,
            "title" to title,
            "body" to body,
            "starCount" to starCount,
            "stars" to stars,
        )
    }
}
Để tạo một bài đăng và đồng thời cập nhật nó lên nguồn cấp dữ liệu hoạt động gần đây và nguồn cấp dữ liệu hoạt động của người đăng bài, ứng dụng viết blog sử dụng mã như sau:

Kotlin+KTX
Java

private fun writeNewPost(userId: String, username: String, title: String, body: String) {
    // Create new post at /user-posts/$userid/$postid and at
    // /posts/$postid simultaneously
    val key = database.child("posts").push().key
    if (key == null) {
        Log.w(TAG, "Couldn't get push key for posts")
        return
    }

    val post = Post(userId, username, title, body)
    val postValues = post.toMap()

    val childUpdates = hashMapOf<String, Any>(
        "/posts/$key" to postValues,
        "/user-posts/$userId/$key" to postValues,
    )

    database.updateChildren(childUpdates)
}
Ví dụ này sử dụng push() để tạo một bài đăng trong nút chứa các bài đăng cho tất cả người dùng tại /posts/$postid và đồng thời truy xuất khóa bằng getKey() . Sau đó, khóa này có thể được sử dụng để tạo mục nhập thứ hai trong bài đăng của người dùng tại /user-posts/$userid/$postid .

Bằng cách sử dụng các đường dẫn này, bạn có thể thực hiện cập nhật đồng thời cho nhiều vị trí trong cây JSON chỉ bằng một lệnh gọi tới updateChildren() , chẳng hạn như cách ví dụ này tạo bài đăng mới ở cả hai vị trí. Các bản cập nhật đồng thời được thực hiện theo cách này mang tính nguyên tử: tất cả các bản cập nhật đều thành công hoặc tất cả các bản cập nhật đều không thành công.

Thêm một cuộc gọi lại hoàn thành
Nếu bạn muốn biết khi nào dữ liệu của mình được cam kết, bạn có thể thêm trình nghe hoàn thành. Cả setValue() và updateChildren() đều có một trình nghe hoàn thành tùy chọn được gọi khi quá trình ghi được thực hiện thành công vào cơ sở dữ liệu. Nếu cuộc gọi không thành công, người nghe sẽ được chuyển một đối tượng lỗi cho biết lý do xảy ra lỗi.

Kotlin+KTX
Java

database.child("users").child(userId).setValue(user)
    .addOnSuccessListener {
        // Write was successful!
        // ...
    }
    .addOnFailureListener {
        // Write failed
        // ...
    }
Xóa dữ liệu
Cách đơn giản nhất để xóa dữ liệu là gọi hàm removeValue() trên tham chiếu đến vị trí của dữ liệu đó.

Bạn cũng có thể xóa bằng cách chỉ định null làm giá trị cho thao tác ghi khác, chẳng hạn như setValue() hoặc updateChildren() . Bạn có thể sử dụng kỹ thuật này với updateChildren() để xóa nhiều thành phần con trong một lệnh gọi API.

Tách người nghe
Lệnh gọi lại bị xóa bằng cách gọi phương thức removeEventListener() trên tham chiếu cơ sở dữ liệu Firebase của bạn.

Nếu một trình nghe đã được thêm nhiều lần vào một vị trí dữ liệu thì nó sẽ được gọi nhiều lần cho mỗi sự kiện và bạn phải tách nó ra với số lần như nhau để xóa nó hoàn toàn.

Việc gọi removeEventListener() trên trình nghe chính không tự động xóa trình nghe đã đăng ký trên các nút con của nó; removeEventListener() cũng phải được gọi trên bất kỳ trình nghe con nào để loại bỏ lệnh gọi lại.

Lưu dữ liệu dưới dạng giao dịch
Khi làm việc với dữ liệu có thể bị hỏng do sửa đổi đồng thời, chẳng hạn như bộ đếm tăng dần, bạn có thể sử dụng thao tác giao dịch . Bạn cung cấp cho thao tác này hai đối số: hàm cập nhật và hàm gọi lại hoàn thành tùy chọn. Hàm cập nhật lấy trạng thái hiện tại của dữ liệu làm đối số và trả về trạng thái mong muốn mới mà bạn muốn ghi. Nếu một ứng dụng khách khác ghi vào vị trí trước khi giá trị mới của bạn được ghi thành công, hàm cập nhật của bạn sẽ được gọi lại với giá trị hiện tại mới và quá trình ghi sẽ được thử lại.

Ví dụ: trong ứng dụng viết blog xã hội mẫu, bạn có thể cho phép người dùng gắn dấu sao và bỏ gắn dấu sao cho bài đăng cũng như theo dõi số lượng sao mà một bài đăng đã nhận được như sau:

Kotlin+KTX
Java

private fun onStarClicked(postRef: DatabaseReference) {
    // ...
    postRef.runTransaction(object : Transaction.Handler {
        override fun doTransaction(mutableData: MutableData): Transaction.Result {
            val p = mutableData.getValue(Post::class.java)
                ?: return Transaction.success(mutableData)

            if (p.stars.containsKey(uid)) {
                // Unstar the post and remove self from stars
                p.starCount = p.starCount - 1
                p.stars.remove(uid)
            } else {
                // Star the post and add self to stars
                p.starCount = p.starCount + 1
                p.stars[uid] = true
            }

            // Set value and report transaction success
            mutableData.value = p
            return Transaction.success(mutableData)
        }

        override fun onComplete(
            databaseError: DatabaseError?,
            committed: Boolean,
            currentData: DataSnapshot?,
        ) {
            // Transaction completed
            Log.d(TAG, "postTransaction:onComplete:" + databaseError!!)
        }
    })
}
Việc sử dụng giao dịch sẽ ngăn số sao không chính xác nếu nhiều người dùng gắn dấu sao cho cùng một bài đăng cùng lúc hoặc khách hàng có dữ liệu cũ. Nếu giao dịch bị từ chối, máy chủ sẽ trả về giá trị hiện tại cho khách hàng, máy khách sẽ chạy lại giao dịch với giá trị được cập nhật. Điều này lặp lại cho đến khi giao dịch được chấp nhận hoặc đã thực hiện quá nhiều lần thử.

Lưu ý: Vì doTransaction() được gọi nhiều lần nên nó phải có khả năng xử lý dữ liệu null . Ngay cả khi có dữ liệu hiện có trong cơ sở dữ liệu từ xa của bạn, dữ liệu đó có thể không được lưu vào bộ nhớ đệm cục bộ khi chức năng giao dịch được chạy, dẫn đến giá trị ban đầu là null .
Gia tăng phía máy chủ nguyên tử
Trong trường hợp sử dụng ở trên, chúng tôi đang ghi hai giá trị vào cơ sở dữ liệu: ID của người dùng đã gắn dấu sao/bỏ gắn dấu sao cho bài đăng và số lượng sao tăng dần. Nếu chúng tôi đã biết người dùng đó đang gắn dấu sao cho bài đăng, chúng tôi có thể sử dụng thao tác tăng dần thay vì giao dịch.

Kotlin+KTX
Java

private fun onStarClicked(uid: String, key: String) {
    val updates: MutableMap<String, Any> = hashMapOf(
        "posts/$key/stars/$uid" to true,
        "posts/$key/starCount" to ServerValue.increment(1),
        "user-posts/$uid/$key/stars/$uid" to true,
        "user-posts/$uid/$key/starCount" to ServerValue.increment(1),
    )
    database.updateChildren(updates)
}
     */

    /*
    Làm việc với danh sách dữ liệu trên Android

bookmark_border
Tài liệu này bao gồm cách làm việc với danh sách dữ liệu trong Firebase. Để tìm hiểu kiến ​​thức cơ bản về đọc và ghi dữ liệu Firebase, hãy xem Đọc và ghi dữ liệu trên Android .

Lưu ý: Theo mặc định, quyền truy cập đọc và ghi vào cơ sở dữ liệu của bạn bị hạn chế nên chỉ những người dùng được xác thực mới có thể đọc hoặc ghi dữ liệu. Để bắt đầu mà không cần thiết lập Xác thực , bạn có thể định cấu hình các quy tắc của mình để truy cập công cộng . Điều này làm cho cơ sở dữ liệu của bạn mở cho bất kỳ ai, ngay cả những người không sử dụng ứng dụng của bạn, vì vậy hãy đảm bảo hạn chế lại cơ sở dữ liệu của bạn khi bạn thiết lập xác thực.
Nhận một tài liệu tham khảo cơ sở dữ liệu
Để đọc và ghi dữ liệu từ cơ sở dữ liệu, bạn cần một phiên bản của DatabaseReference :

Kotlin+KTX
Java

private DatabaseReference mDatabase;
// ...
mDatabase = FirebaseDatabase.getInstance().getReference();
Đọc và viết danh sách
Thêm vào danh sách dữ liệu
Sử dụng phương thức push() để nối dữ liệu vào danh sách trong các ứng dụng nhiều người dùng. Phương thức push() tạo một khóa duy nhất mỗi khi một phần tử con mới được thêm vào tham chiếu Firebase đã chỉ định. Bằng cách sử dụng các khóa được tạo tự động này cho từng thành phần mới trong danh sách, một số khách hàng có thể thêm các thành phần con vào cùng một vị trí cùng lúc mà không bị xung đột khi ghi. Khóa duy nhất được tạo bởi push() dựa trên dấu thời gian, do đó các mục trong danh sách sẽ tự động được sắp xếp theo thứ tự thời gian.

Bạn có thể sử dụng tham chiếu đến dữ liệu mới được phương thức push() trả về để lấy giá trị của khóa được tạo tự động hoặc dữ liệu tập hợp cho trẻ. Gọi getKey() trên tham chiếu push() trả về giá trị của khóa được tạo tự động.

Bạn có thể sử dụng các khóa được tạo tự động này để đơn giản hóa việc làm phẳng cấu trúc dữ liệu của mình. Để biết thêm thông tin, hãy xem ví dụ về phân xuất dữ liệu.

Lắng nghe các sự kiện trẻ em
Khi làm việc với danh sách, ứng dụng của bạn nên lắng nghe các sự kiện con thay vì các sự kiện giá trị được sử dụng cho các đối tượng đơn lẻ.

Các sự kiện con được kích hoạt để phản hồi các hoạt động cụ thể xảy ra với các nút con của một nút từ một thao tác, chẳng hạn như một nút con mới được thêm thông qua phương thức push() hoặc một nút con được cập nhật thông qua phương thức updateChildren() . Mỗi thứ này kết hợp với nhau có thể hữu ích cho việc lắng nghe những thay đổi đối với một nút cụ thể trong cơ sở dữ liệu.

Để lắng nghe các sự kiện con trên DatabaseReference , hãy đính kèm ChildEventListener :

Người nghe	Gọi lại sự kiện	Cách sử dụng điển hình
ChildEventListener	onChildAdded()	Truy xuất danh sách các mục hoặc lắng nghe phần bổ sung vào danh sách các mục. Lệnh gọi lại này được kích hoạt một lần cho mỗi thành phần con hiện có và sau đó được kích hoạt lại mỗi khi có một thành phần con mới được thêm vào đường dẫn đã chỉ định. DataSnapshot được truyền tới trình nghe chứa dữ liệu của thành phần con mới.
onChildChanged()	Lắng nghe những thay đổi đối với các mục trong danh sách. Sự kiện này được kích hoạt bất cứ khi nào nút con được sửa đổi, bao gồm mọi sửa đổi đối với nút con của nút con. DataSnapshot được chuyển tới trình xử lý sự kiện chứa dữ liệu cập nhật cho trẻ.
onChildRemoved()	Lắng nghe các mục bị xóa khỏi danh sách. DataSnapshot được chuyển tới lệnh gọi lại sự kiện chứa dữ liệu cho thành phần con đã bị xóa.
onChildMoved()	Lắng nghe những thay đổi về thứ tự của các mục trong danh sách có thứ tự. Sự kiện này được kích hoạt bất cứ khi nào lệnh gọi lại onChildChanged() được kích hoạt bởi một bản cập nhật khiến trẻ sắp xếp lại thứ tự. Nó được sử dụng với dữ liệu được sắp xếp theo orderByChild hoặc orderByValue .
Ví dụ: một ứng dụng viết blog xã hội có thể sử dụng các phương pháp này cùng nhau để theo dõi hoạt động trong các nhận xét của bài đăng, như minh họa bên dưới:

Kotlin+KTX
Java

val childEventListener = object : ChildEventListener {
    override fun onChildAdded(dataSnapshot: DataSnapshot, previousChildName: String?) {
        Log.d(TAG, "onChildAdded:" + dataSnapshot.key!!)

        // A new comment has been added, add it to the displayed list
        val comment = dataSnapshot.getValue<Comment>()

        // ...
    }

    override fun onChildChanged(dataSnapshot: DataSnapshot, previousChildName: String?) {
        Log.d(TAG, "onChildChanged: ${dataSnapshot.key}")

        // A comment has changed, use the key to determine if we are displaying this
        // comment and if so displayed the changed comment.
        val newComment = dataSnapshot.getValue<Comment>()
        val commentKey = dataSnapshot.key

        // ...
    }

    override fun onChildRemoved(dataSnapshot: DataSnapshot) {
        Log.d(TAG, "onChildRemoved:" + dataSnapshot.key!!)

        // A comment has changed, use the key to determine if we are displaying this
        // comment and if so remove it.
        val commentKey = dataSnapshot.key

        // ...
    }

    override fun onChildMoved(dataSnapshot: DataSnapshot, previousChildName: String?) {
        Log.d(TAG, "onChildMoved:" + dataSnapshot.key!!)

        // A comment has changed position, use the key to determine if we are
        // displaying this comment and if so move it.
        val movedComment = dataSnapshot.getValue<Comment>()
        val commentKey = dataSnapshot.key

        // ...
    }

    override fun onCancelled(databaseError: DatabaseError) {
        Log.w(TAG, "postComments:onCancelled", databaseError.toException())
        Toast.makeText(
            context,
            "Failed to load comments.",
            Toast.LENGTH_SHORT,
        ).show()
    }
}
databaseReference.addChildEventListener(childEventListener)
Lắng nghe các sự kiện giá trị
Mặc dù sử dụng ChildEventListener là cách được khuyến nghị để đọc danh sách dữ liệu, nhưng có những trường hợp việc đính kèm ValueEventListener vào tham chiếu danh sách sẽ hữu ích.

Việc đính kèm ValueEventListener vào danh sách dữ liệu sẽ trả về toàn bộ danh sách dữ liệu dưới dạng một DataSnapshot duy nhất, sau đó bạn có thể lặp lại để truy cập từng dữ liệu con.

Ngay cả khi chỉ có một kết quả khớp duy nhất cho truy vấn, ảnh chụp nhanh vẫn là một danh sách; nó chỉ chứa một mục duy nhất. Để truy cập mục, bạn cần lặp lại kết quả:

Kotlin+KTX
Java

// My top posts by number of stars
myTopPostsQuery.addValueEventListener(object : ValueEventListener {
    override fun onDataChange(dataSnapshot: DataSnapshot) {
        for (postSnapshot in dataSnapshot.children) {
            // TODO: handle the post
        }
    }

    override fun onCancelled(databaseError: DatabaseError) {
        // Getting Post failed, log a message
        Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
        // ...
    }
})
Mẫu này có thể hữu ích khi bạn muốn tìm nạp tất cả danh sách con trong một thao tác duy nhất, thay vì lắng nghe các sự kiện onChildAdded bổ sung.

Tách người nghe
Lệnh gọi lại bị xóa bằng cách gọi phương thức removeEventListener() trên tham chiếu cơ sở dữ liệu Firebase của bạn.

Nếu một trình nghe đã được thêm nhiều lần vào một vị trí dữ liệu thì nó sẽ được gọi nhiều lần cho mỗi sự kiện và bạn phải tách nó ra với số lần như nhau để xóa nó hoàn toàn.

Việc gọi removeEventListener() trên trình nghe chính không tự động xóa trình nghe đã đăng ký trên các nút con của nó; removeEventListener() cũng phải được gọi trên bất kỳ trình nghe con nào để loại bỏ lệnh gọi lại.

Sắp xếp và lọc dữ liệu
Bạn có thể sử dụng lớp Query cơ sở dữ liệu thời gian thực để truy xuất dữ liệu được sắp xếp theo khóa, theo giá trị hoặc theo giá trị của phần tử con. Bạn cũng có thể lọc kết quả đã sắp xếp theo một số kết quả cụ thể hoặc một phạm vi khóa hoặc giá trị.

Lưu ý: Việc lọc và sắp xếp có thể tốn kém, đặc biệt khi thực hiện trên máy khách. Nếu ứng dụng của bạn sử dụng truy vấn, hãy xác định quy tắc .indexOn để lập chỉ mục các khóa đó trên máy chủ và cải thiện hiệu suất truy vấn như được mô tả trong Lập chỉ mục dữ liệu của bạn .
Sắp xếp dữ liệu
Để truy xuất dữ liệu đã được sắp xếp, hãy bắt đầu bằng cách chỉ định một trong các phương pháp theo thứ tự để xác định cách sắp xếp kết quả:

Phương pháp	Cách sử dụng
orderByChild()	Sắp xếp kết quả theo giá trị của khóa con được chỉ định hoặc đường dẫn con lồng nhau.
orderByKey()	Sắp xếp kết quả theo khóa con.
orderByValue()	Sắp xếp kết quả theo giá trị con.
Bạn chỉ có thể sử dụng một phương pháp theo thứ tự tại một thời điểm. Việc gọi một phương thức theo thứ tự nhiều lần trong cùng một truy vấn sẽ gây ra lỗi.

Ví dụ sau minh họa cách bạn có thể truy xuất danh sách các bài đăng hàng đầu của người dùng được sắp xếp theo số sao của họ:

Kotlin+KTX
Java

// My top posts by number of stars
val myUserId = uid
val myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
    .orderByChild("starCount")

myTopPostsQuery.addChildEventListener(object : ChildEventListener {
    // TODO: implement the ChildEventListener methods as documented above
    // ...
})
Điều này xác định một truy vấn mà khi kết hợp với trình nghe con sẽ đồng bộ hóa ứng dụng khách với các bài đăng của người dùng từ đường dẫn trong cơ sở dữ liệu dựa trên ID người dùng của họ, được sắp xếp theo số sao mà mỗi bài đăng đã nhận được. Kỹ thuật sử dụng ID làm khóa chỉ mục này được gọi là data fan out, bạn có thể đọc thêm về nó trong Cấu trúc cơ sở dữ liệu của bạn .

Lệnh gọi phương thức orderByChild() chỉ định khóa con để sắp xếp kết quả theo. Trong trường hợp này, các bài đăng được sắp xếp theo giá trị của phần tử con "starCount" tương ứng. Các truy vấn cũng có thể được sắp xếp theo thứ tự con lồng nhau, trong trường hợp bạn có dữ liệu giống như sau:


"posts": {
  "ts-functions": {
    "metrics": {
      "views" : 1200000,
      "likes" : 251000,
      "shares": 1200,
    },
    "title" : "Why you should use TypeScript for writing Cloud Functions",
    "author": "Doug",
  },
  "android-arch-3": {
    "metrics": {
      "views" : 900000,
      "likes" : 117000,
      "shares": 144,
    },
    "title" : "Using Android Architecture Components with Firebase Realtime Database (Part 3)",
    "author": "Doug",
  }
},
Trong ví dụ này, chúng ta có thể sắp xếp các thành phần trong danh sách theo các giá trị được lồng trong khóa metrics bằng cách chỉ định đường dẫn tương đối đến phần tử con được lồng trong lệnh gọi orderByChild() của chúng ta.

Kotlin+KTX
Java

// Most viewed posts
val myMostViewedPostsQuery = databaseReference.child("posts")
    .orderByChild("metrics/views")
myMostViewedPostsQuery.addChildEventListener(object : ChildEventListener {
    // TODO: implement the ChildEventListener methods as documented above
    // ...
})
Để biết thêm thông tin về cách sắp xếp các loại dữ liệu khác, hãy xem Cách sắp xếp thứ tự dữ liệu truy vấn .

Lọc dữ liệu
Để lọc dữ liệu, bạn có thể kết hợp bất kỳ phương pháp giới hạn hoặc phạm vi nào với phương pháp theo thứ tự khi xây dựng truy vấn.

Phương pháp	Cách sử dụng
limitToFirst()	Đặt số lượng mục tối đa cần trả về từ đầu danh sách kết quả được sắp xếp.
limitToLast()	Đặt số lượng mục tối đa cần trả về từ cuối danh sách kết quả được sắp xếp.
startAt()	Trả về các mục lớn hơn hoặc bằng khóa hoặc giá trị được chỉ định tùy thuộc vào phương pháp theo thứ tự đã chọn.
startAfter()	Trả về các mục lớn hơn khóa hoặc giá trị được chỉ định tùy thuộc vào phương pháp theo thứ tự đã chọn.
endAt()	Trả về các mục nhỏ hơn hoặc bằng khóa hoặc giá trị được chỉ định tùy thuộc vào phương pháp theo thứ tự đã chọn.
endBefore()	Trả về các mục nhỏ hơn khóa hoặc giá trị được chỉ định tùy thuộc vào phương pháp theo thứ tự đã chọn.
equalTo()	Trả về các mục bằng khóa hoặc giá trị được chỉ định tùy thuộc vào phương thức theo thứ tự đã chọn.
Không giống như các phương pháp theo thứ tự, bạn có thể kết hợp nhiều hàm giới hạn hoặc phạm vi. Ví dụ: bạn có thể kết hợp các phương thức startAt() và endAt() để giới hạn kết quả ở một phạm vi giá trị được chỉ định.

Ngay cả khi chỉ có một kết quả khớp duy nhất cho truy vấn, ảnh chụp nhanh vẫn là một danh sách; nó chỉ chứa một mục duy nhất. Để truy cập mục, bạn cần lặp lại kết quả:

Kotlin+KTX
Java

// My top posts by number of stars
myTopPostsQuery.addValueEventListener(object : ValueEventListener {
    override fun onDataChange(dataSnapshot: DataSnapshot) {
        for (postSnapshot in dataSnapshot.children) {
            // TODO: handle the post
        }
    }

    override fun onCancelled(databaseError: DatabaseError) {
        // Getting Post failed, log a message
        Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
        // ...
    }
})
Giới hạn số lượng kết quả
Bạn có thể sử dụng các phương thức limitToFirst() và limitToLast() để đặt số lượng con tối đa được đồng bộ hóa cho một cuộc gọi lại nhất định. Ví dụ: nếu bạn sử dụng limitToFirst() để đặt giới hạn là 100 thì ban đầu bạn chỉ nhận được tối đa 100 lệnh gọi lại onChildAdded() . Nếu bạn có ít hơn 100 mục được lưu trữ trong cơ sở dữ liệu Firebase của mình, lệnh gọi lại onChildAdded() sẽ kích hoạt cho từng mục.

Khi các mục thay đổi, bạn sẽ nhận được lệnh gọi lại onChildAdded() cho các mục nhập truy vấn và lệnh gọi lại onChildRemoved() cho các mục bị loại bỏ để tổng số vẫn ở mức 100.

Ví dụ sau đây minh họa cách ứng dụng viết blog mẫu xác định truy vấn để truy xuất danh sách 100 bài đăng gần đây nhất của tất cả người dùng:

Kotlin+KTX
Java

// Last 100 posts, these are automatically the 100 most recent
// due to sorting by push() keys.
databaseReference.child("posts").limitToFirst(100)

     */

    /*
    Kích hoạt khả năng ngoại tuyến trên Android

bookmark_border
Ứng dụng Firebase hoạt động ngay cả khi ứng dụng của bạn tạm thời mất kết nối mạng. Ngoài ra, Firebase còn cung cấp các công cụ để lưu trữ dữ liệu cục bộ, quản lý sự hiện diện và xử lý độ trễ.

Độ bền của đĩa
Ứng dụng Firebase tự động xử lý tình trạng gián đoạn mạng tạm thời. Dữ liệu được lưu trong bộ nhớ đệm khả dụng khi ngoại tuyến và Firebase gửi lại mọi nội dung ghi khi kết nối mạng được khôi phục.

Khi bạn bật tính năng lưu trữ liên tục của ổ đĩa, ứng dụng của bạn sẽ ghi dữ liệu cục bộ vào thiết bị để ứng dụng của bạn có thể duy trì trạng thái khi ngoại tuyến, ngay cả khi người dùng hoặc hệ điều hành khởi động lại ứng dụng.

Bạn có thể kích hoạt tính bền vững của ổ đĩa chỉ bằng một dòng mã.

Kotlin+KTX
Java

FirebaseDatabase.getInstance().setPersistenceEnabled(true);
Hành vi kiên trì
Bằng cách bật tính năng lưu giữ lâu dài, mọi dữ liệu mà ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase sẽ đồng bộ hóa khi trực tuyến vẫn tồn tại trên đĩa và khả dụng ngoại tuyến, ngay cả khi người dùng hoặc hệ điều hành khởi động lại ứng dụng. Điều này có nghĩa là ứng dụng của bạn hoạt động như trực tuyến bằng cách sử dụng dữ liệu cục bộ được lưu trữ trong bộ đệm. Lệnh gọi lại của trình nghe sẽ tiếp tục kích hoạt để cập nhật cục bộ.

Ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase tự động giữ một hàng đợi tất cả các thao tác ghi được thực hiện khi ứng dụng của bạn ngoại tuyến. Khi tính năng lưu giữ được bật, hàng đợi này cũng được lưu vào đĩa để tất cả các thao tác ghi của bạn đều khả dụng khi người dùng hoặc hệ điều hành khởi động lại ứng dụng. Khi ứng dụng lấy lại kết nối, tất cả các hoạt động sẽ được gửi đến máy chủ Cơ sở dữ liệu thời gian thực Firebase.

Nếu ứng dụng của bạn sử dụng Xác thực Firebase thì ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase sẽ duy trì mã thông báo xác thực của người dùng khi khởi động lại ứng dụng. Nếu mã thông báo xác thực hết hạn khi ứng dụng của bạn ngoại tuyến, ứng dụng khách sẽ tạm dừng thao tác ghi cho đến khi ứng dụng của bạn xác thực lại người dùng, nếu không thì thao tác ghi có thể không thành công do các quy tắc bảo mật.

Giữ dữ liệu luôn mới
Cơ sở dữ liệu thời gian thực Firebase đồng bộ hóa và lưu trữ bản sao dữ liệu cục bộ cho người nghe đang hoạt động. Ngoài ra, bạn có thể giữ các vị trí cụ thể được đồng bộ hóa.

Kotlin+KTX
Java

DatabaseReference scoresRef = FirebaseDatabase.getInstance().getReference("scores");
scoresRef.keepSynced(true);
Ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase tự động tải xuống dữ liệu tại các vị trí này và giữ dữ liệu được đồng bộ hóa ngay cả khi tham chiếu không có trình xử lý đang hoạt động. Bạn có thể tắt đồng bộ hóa lại bằng dòng mã sau.

Kotlin+KTX
Java

scoresRef.keepSynced(false);
Theo mặc định, 10 MB dữ liệu đã đồng bộ hóa trước đó sẽ được lưu vào bộ đệm. Điều này là đủ cho hầu hết các ứng dụng. Nếu bộ đệm vượt quá kích thước được định cấu hình của nó, Cơ sở dữ liệu thời gian thực Firebase sẽ xóa dữ liệu ít được sử dụng gần đây nhất. Dữ liệu được giữ đồng bộ sẽ không bị xóa khỏi bộ đệm.

Truy vấn dữ liệu ngoại tuyến
Cơ sở dữ liệu thời gian thực Firebase lưu trữ dữ liệu được trả về từ truy vấn để sử dụng khi ngoại tuyến. Đối với các truy vấn được tạo khi ngoại tuyến, Cơ sở dữ liệu thời gian thực Firebase tiếp tục hoạt động đối với dữ liệu đã tải trước đó. Nếu dữ liệu được yêu cầu chưa được tải, Cơ sở dữ liệu thời gian thực Firebase sẽ tải dữ liệu từ bộ đệm cục bộ. Khi kết nối mạng khả dụng trở lại, dữ liệu sẽ tải và sẽ phản ánh truy vấn.

Ví dụ: mã này truy vấn bốn mục cuối cùng trong Cơ sở dữ liệu điểm số theo thời gian thực của Firebase

Kotlin+KTX
Java

DatabaseReference scoresRef = FirebaseDatabase.getInstance().getReference("scores");
scoresRef.orderByValue().limitToLast(4).addChildEventListener(new ChildEventListener() {
    @Override
    public void onChildAdded(@NonNull DataSnapshot snapshot, String previousChild) {
        Log.d(TAG, "The " + snapshot.getKey() + " dinosaur's score is " + snapshot.getValue());
    }

    // ...
});
Giả sử rằng người dùng mất kết nối, ngoại tuyến và khởi động lại ứng dụng. Khi vẫn ngoại tuyến, ứng dụng sẽ truy vấn hai mục cuối cùng từ cùng một vị trí. Truy vấn này sẽ trả về thành công hai mục cuối vì ứng dụng đã tải tất cả bốn mục trong truy vấn trên.

Kotlin+KTX
Java

scoresRef.orderByValue().limitToLast(2).addChildEventListener(new ChildEventListener() {
    @Override
    public void onChildAdded(@NonNull DataSnapshot snapshot, String previousChild) {
        Log.d(TAG, "The " + snapshot.getKey() + " dinosaur's score is " + snapshot.getValue());
    }

    // ...
});
Trong ví dụ trước, ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase tăng cường các sự kiện 'được thêm con' cho hai con khủng long có điểm cao nhất bằng cách sử dụng bộ nhớ đệm liên tục. Nhưng nó sẽ không đưa ra sự kiện 'giá trị' vì ứng dụng chưa bao giờ thực hiện truy vấn đó khi trực tuyến.

Nếu ứng dụng yêu cầu sáu mục cuối cùng khi ngoại tuyến, ứng dụng sẽ nhận được các sự kiện 'đã thêm con' cho bốn mục được lưu trong bộ nhớ đệm ngay lập tức. Khi thiết bị trực tuyến trở lại, ứng dụng khách Cơ sở dữ liệu thời gian thực Firebase sẽ đồng bộ hóa với máy chủ và nhận hai sự kiện 'được thêm con' và 'giá trị' cuối cùng cho ứng dụng.

Xử lý giao dịch ngoại tuyến
Mọi giao dịch được thực hiện khi ứng dụng ngoại tuyến sẽ được xếp hàng đợi. Sau khi ứng dụng lấy lại được kết nối mạng, các giao dịch sẽ được gửi đến máy chủ Cơ sở dữ liệu thời gian thực.

Giao dịch không được duy trì khi khởi động lại ứng dụng
Ngay cả khi bật tính năng liên tục, các giao dịch vẫn không được duy trì khi khởi động lại ứng dụng. Vì vậy, bạn không thể dựa vào các giao dịch được thực hiện ngoại tuyến được cam kết với Cơ sở dữ liệu thời gian thực Firebase của mình. Để cung cấp trải nghiệm người dùng tốt nhất, ứng dụng của bạn phải hiển thị rằng giao dịch chưa được lưu vào Cơ sở dữ liệu thời gian thực Firebase hoặc đảm bảo ứng dụng của bạn ghi nhớ chúng theo cách thủ công và thực hiện lại chúng sau khi khởi động lại ứng dụng.

Cơ sở dữ liệu thời gian thực Firebase có nhiều tính năng để xử lý các tình huống ngoại tuyến và kết nối mạng. Phần còn lại của hướng dẫn này áp dụng cho ứng dụng của bạn cho dù bạn có bật tính năng lưu giữ lâu dài hay không.
Quản lý sự hiện diện
Trong các ứng dụng thời gian thực, việc phát hiện khi nào máy khách kết nối và ngắt kết nối thường rất hữu ích. Ví dụ: bạn có thể muốn đánh dấu người dùng là 'ngoại tuyến' khi máy khách của họ ngắt kết nối.

Máy khách Cơ sở dữ liệu Firebase cung cấp các nguyên hàm đơn giản mà bạn có thể sử dụng để ghi vào cơ sở dữ liệu khi máy khách ngắt kết nối khỏi máy chủ Cơ sở dữ liệu Firebase. Các cập nhật này xảy ra cho dù máy khách có ngắt kết nối hoàn toàn hay không, vì vậy bạn có thể dựa vào chúng để dọn sạch dữ liệu ngay cả khi kết nối bị ngắt hoặc máy khách gặp sự cố. Tất cả các thao tác ghi, bao gồm cài đặt, cập nhật và xóa, có thể được thực hiện khi ngắt kết nối.

Đây là một ví dụ đơn giản về ghi dữ liệu khi ngắt kết nối bằng cách sử dụng nguyên hàm onDisconnect :

Kotlin+KTX
Java

DatabaseReference presenceRef = FirebaseDatabase.getInstance().getReference("disconnectmessage");
// Write a string when this client loses connection
presenceRef.onDisconnect().setValue("I disconnected!");
Cách thức hoạt động của onDisconnect
Khi bạn thiết lập thao tác onDisconnect() , thao tác đó sẽ tồn tại trên máy chủ Cơ sở dữ liệu thời gian thực Firebase. Máy chủ kiểm tra bảo mật để đảm bảo người dùng có thể thực hiện sự kiện ghi được yêu cầu và thông báo cho ứng dụng của bạn nếu sự kiện đó không hợp lệ. Sau đó, máy chủ sẽ giám sát kết nối. Nếu tại bất kỳ thời điểm nào kết nối hết thời gian hoặc bị máy khách Cơ sở dữ liệu thời gian thực chủ động đóng, máy chủ sẽ kiểm tra bảo mật lần thứ hai (để đảm bảo thao tác vẫn hợp lệ) rồi gọi sự kiện.

Ứng dụng của bạn có thể sử dụng lệnh gọi lại trong thao tác ghi để đảm bảo onDisconnect được đính kèm chính xác:

Kotlin+KTX
Java

presenceRef.onDisconnect().removeValue(new DatabaseReference.CompletionListener() {
    @Override
    public void onComplete(DatabaseError error, @NonNull DatabaseReference reference) {
        if (error != null) {
            Log.d(TAG, "could not establish onDisconnect event:" + error.getMessage());
        }
    }
});
Sự kiện onDisconnect cũng có thể bị hủy bằng cách gọi .cancel() :

Kotlin+KTX
Java

OnDisconnect onDisconnectRef = presenceRef.onDisconnect();
onDisconnectRef.setValue("I disconnected");
// ...
// some time later when we change our minds
// ...
onDisconnectRef.cancel();
Phát hiện trạng thái kết nối
Đối với nhiều tính năng liên quan đến sự hiện diện, việc ứng dụng của bạn biết khi nào nó trực tuyến hay ngoại tuyến sẽ rất hữu ích. Cơ sở dữ liệu thời gian thực Firebase cung cấp một vị trí đặc biệt tại /.info/connected được cập nhật mỗi khi trạng thái kết nối của máy khách Cơ sở dữ liệu thời gian thực Firebase thay đổi. Đây là một ví dụ:

Kotlin+KTX
Java

DatabaseReference connectedRef = FirebaseDatabase.getInstance().getReference(".info/connected");
connectedRef.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        boolean connected = snapshot.getValue(Boolean.class);
        if (connected) {
            Log.d(TAG, "connected");
        } else {
            Log.d(TAG, "not connected");
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {
        Log.w(TAG, "Listener was cancelled");
    }
});
/.info/connected là giá trị boolean không được đồng bộ hóa giữa các máy khách Cơ sở dữ liệu thời gian thực vì giá trị này phụ thuộc vào trạng thái của máy khách. Nói cách khác, nếu một khách hàng đọc /.info/connected là sai, điều này không đảm bảo rằng một khách hàng riêng biệt cũng sẽ đọc sai.

Trên Android, Firebase tự động quản lý trạng thái kết nối để giảm băng thông và mức sử dụng pin. Khi khách hàng không có trình xử lý đang hoạt động, không có thao tác ghi hoặc onDisconnect đang chờ xử lý và không bị ngắt kết nối rõ ràng bằng phương thức goOffline , Firebase sẽ đóng kết nối sau 60 giây không hoạt động.

Xử lý độ trễ
Dấu thời gian của máy chủ
Máy chủ Cơ sở dữ liệu thời gian thực Firebase cung cấp cơ chế chèn dấu thời gian được tạo trên máy chủ dưới dạng dữ liệu. Tính năng này, kết hợp với onDisconnect , cung cấp một cách dễ dàng để ghi chú một cách đáng tin cậy về thời điểm máy khách Cơ sở dữ liệu thời gian thực bị ngắt kết nối:

Kotlin+KTX
Java

DatabaseReference userLastOnlineRef = FirebaseDatabase.getInstance().getReference("users/joe/lastOnline");
userLastOnlineRef.onDisconnect().setValue(ServerValue.TIMESTAMP);
Đồng hồ lệch
Mặc dù firebase.database.ServerValue.TIMESTAMP chính xác hơn nhiều và thích hợp hơn cho hầu hết các hoạt động đọc/ghi, nhưng đôi khi việc ước tính độ lệch đồng hồ của máy khách so với các máy chủ của Cơ sở dữ liệu thời gian thực Firebase có thể hữu ích. Bạn có thể đính kèm lệnh gọi lại vào vị trí /.info/serverTimeOffset để nhận giá trị tính bằng mili giây mà máy khách Cơ sở dữ liệu thời gian thực Firebase thêm vào thời gian được báo cáo cục bộ (thời gian kỷ nguyên tính bằng mili giây) để ước tính thời gian của máy chủ. Lưu ý rằng độ chính xác của chênh lệch này có thể bị ảnh hưởng bởi độ trễ mạng và do đó hữu ích chủ yếu khi phát hiện sự khác biệt lớn (> 1 giây) về thời gian đồng hồ.

Kotlin+KTX
Java

DatabaseReference offsetRef = FirebaseDatabase.getInstance().getReference(".info/serverTimeOffset");
offsetRef.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        double offset = snapshot.getValue(Double.class);
        double estimatedServerTimeMs = System.currentTimeMillis() + offset;
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {
        Log.w(TAG, "Listener was cancelled");
    }
});
Ứng dụng hiện diện mẫu
Bằng cách kết hợp các hoạt động ngắt kết nối với giám sát trạng thái kết nối và dấu thời gian của máy chủ, bạn có thể xây dựng hệ thống hiện diện của người dùng. Trong hệ thống này, mỗi người dùng lưu trữ dữ liệu tại một vị trí cơ sở dữ liệu để cho biết liệu máy khách Cơ sở dữ liệu thời gian thực có trực tuyến hay không. Khách hàng đặt vị trí này thành true khi họ trực tuyến và dấu thời gian khi họ ngắt kết nối. Dấu thời gian này cho biết lần cuối cùng người dùng cụ thể trực tuyến.

Lưu ý rằng ứng dụng của bạn phải xếp hàng các hoạt động ngắt kết nối trước khi người dùng được đánh dấu trực tuyến, để tránh mọi điều kiện tương tranh trong trường hợp mất kết nối mạng của máy khách trước khi cả hai lệnh có thể được gửi đến máy chủ.

Đây là một hệ thống hiện diện người dùng đơn giản:

Kotlin+KTX
Java

// Since I can connect from multiple devices, we store each connection instance separately
// any time that connectionsRef's value is null (i.e. has no children) I am offline
final FirebaseDatabase database = FirebaseDatabase.getInstance();
final DatabaseReference myConnectionsRef = database.getReference("users/joe/connections");

// Stores the timestamp of my last disconnect (the last time I was seen online)
final DatabaseReference lastOnlineRef = database.getReference("/users/joe/lastOnline");

final DatabaseReference connectedRef = database.getReference(".info/connected");
connectedRef.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        boolean connected = snapshot.getValue(Boolean.class);
        if (connected) {
            DatabaseReference con = myConnectionsRef.push();

            // When this device disconnects, remove it
            con.onDisconnect().removeValue();

            // When I disconnect, update the last time I was seen online
            lastOnlineRef.onDisconnect().setValue(ServerValue.TIMESTAMP);

            // Add this device to my connections list
            // this value could contain info about the device or a timestamp too
            con.setValue(Boolean.TRUE);
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {
        Log.w(TAG, "Listener was cancelled at .info/connected");
    }
});

     */
private void SignUOn(){
        /*
        --Hiện Ck-Mkhau
            +Kbao:private CheckBox check;

            +Ktao: check = findViewById(R.id.hienmk);

            check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(check.isChecked()){
                    edtpassword.setTransformationMethod(null);
                }else{
                    edtpassword.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        layoutSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });

        initListener();
    }


            +SuaHam:-->Nen them not Xoa
                private void initListener() {
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtname.getText().toString();
                String gmail = edtgmail.getText().toString();
                String password = edtpassword.getText().toString();

                boolean check = validateInfo(name, gmail, password);
                if(check == true){
                    //Toast.makeText(SignUp.this,"Thành công",Toast.LENGTH_LONG).show();
                    onClickSignUp();
                }else{
                    Toast.makeText(SignUp.this,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

            +Them Ham:
            private boolean validateInfo(String name, String gmail, String password){
        if(name.length() == 0){
            edtname.requestFocus();
            Toast.makeText(SignUp.this,"Tên không để trống",Toast.LENGTH_LONG).show();
            return false;
        }

        else if(gmail.length() == 0){
            edtgmail.requestFocus();
            Toast.makeText(SignUp.this,"Gmail không để trống",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(!gmail.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            edtgmail.requestFocus();
            Toast.makeText(SignUp.this,"Gmail không hợp lệ",Toast.LENGTH_LONG).show();
            return false;
        }else if(password.length() == 0){
            edtpassword.requestFocus();
            Toast.makeText(SignUp.this,"Password không để trống",Toast.LENGTH_LONG).show();
            return false;
        }else if(!password.matches("(.*[0-9].*)")){
            edtpassword.requestFocus();
            Toast.makeText(SignUp.this,"Password cần 1 số",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(!password.matches("(.*[a-z].*)")){
            edtpassword.requestFocus();
            Toast.makeText(SignUp.this,"Password cần 1 chữ thường",Toast.LENGTH_LONG).show();
            return false;
        }else if(!password.matches("(.*[A-Z].*)")){
            edtpassword.requestFocus();
            Toast.makeText(SignUp.this,"Password cần 1 chữ hoa",Toast.LENGTH_LONG).show();
            return false;
        }else if(!password.matches("(.*[!@#$%^&*()_+=\\[{\\]};].*)")){
            edtpassword.requestFocus();
            Toast.makeText(SignUp.this,"Password cần 1 ký tự đặc biệt",Toast.LENGTH_LONG).show();
            return false;
        }
//        else if(!password.matches("^0\\d{9}$")){
//            edtpassword.requestFocus();
//            Toast.makeText(SignUp.this,"Số điện thoại chưa đúng",Toast.LENGTH_LONG).show();
//            return false;
//        }
            return true;
    }

        Layout:
            <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="80dp"
            android:gravity="center"
            android:orientation="vertical">

            <EditText
                android:id="@+id/Nameus"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="10dp"
                android:ems="11"
                android:hint="Name"
                android:imeOptions="actionNext"
                android:textSize="28dp" />

            <EditText
                android:id="@+id/GmailSU"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="10dp"
                android:ems="11"
                android:hint="Gmail"
                android:imeOptions="actionNext"
                android:inputType="textEmailAddress"
                android:textSize="28dp"></EditText>

            <!--        <EditText-->
            <!--            android:id="@+id/name"-->
            <!--            android:layout_width="wrap_content"-->
            <!--            android:layout_height="wrap_content"-->
            <!--            android:hint="Nhập họ tên"-->
            <!--            android:textSize="28dp"-->
            <!--            android:ems="11"-->
            <!--            android:layout_marginBottom="10dp">-->

            <!--        </EditText>-->

            <EditText
                android:id="@+id/PasswordSU"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:ems="11"
                android:hint="Mật khẩu"
                android:imeOptions="actionDone"
                android:inputType="textPassword"
                android:textSize="28dp">

            </EditText>
            <!--        <EditText-->
            <!--            android:id="@+id/PasswordSU2"-->
            <!--            android:layout_width="wrap_content"-->
            <!--            android:layout_height="wrap_content"-->
            <!--            android:hint="Xác nhận mật khẩu"-->
            <!--            android:textSize="28dp"-->
            <!--            android:ems="11"-->
            <!--            android:inputType="textPassword"-->
            <!--            android:layout_marginBottom="12dp"-->
            <!--            android:layout_marginTop="10dp">-->

            <!--        </EditText>-->

            <CheckBox
                android:id="@+id/hienmk"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Hiện mật khẩu"
                android:textSize="20dp"
                android:layout_marginRight="100dp"/>

            <Button
                android:id="@+id/SignUp"
                android:layout_width="180dp"
                android:layout_height="wrap_content"
                android:text="Đăng Ký"
                android:textSize="20dp">

            </Button>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="horizontal">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginRight="10dp"
                    android:text="Nếu đã có mật khẩu?"
                    android:textSize="25dp">

                </TextView>

                <TextView
                    android:id="@+id/layout_signin"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Đăng nhập"
                    android:textColor="#0238F8"
                    android:textSize="25dp">


                </TextView>
            </LinearLayout>
        </LinearLayout>
    </RelativeLayout>

        * */
}

private void SigInOn(){
        /*
        --Ck Pas:
        +Kbao: private CheckBox check;

        +Ktao: check = findViewById(R.id.hienmk);
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(check.isChecked()){
                    edtpassword.setTransformationMethod(null);
                }else{
                    edtpassword.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });

        +Layput:<RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="100dp"
            android:gravity="center"
            android:orientation="vertical">

            <EditText
                android:id="@+id/edit_gmail"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="10dp"
                android:ems="11"
                android:hint="Gmail"
                android:imeOptions="actionNext"
                android:inputType="textEmailAddress"
                android:textSize="28dp" />

            <EditText
                android:id="@+id/edit_password"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:ems="11"
                android:hint="Mật khẩu"
                android:imeOptions="actionDone"
                android:inputType="textPassword"
                android:textSize="28dp">

            </EditText>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginRight="30dp">

                    <CheckBox
                        android:id="@+id/hienmk"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Hiện mật khẩu"
                        android:textSize="20dp" />
                </LinearLayout>

                <LinearLayout
                    android:id="@+id/forgot_password"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_gravity="right"
                        android:layout_marginRight="25dp"
                        android:text="Quên mật khẩu?"
                        android:textSize="20dp"/>

                </LinearLayout>
            </LinearLayout>


            <Button
                android:id="@+id/SignIn"
                android:layout_width="180dp"
                android:layout_height="wrap_content"
                android:text="Đăng Nhập"
                android:textSize="20dp">

            </Button>

            <Button
                android:id="@+id/SignUp"
                android:layout_width="180dp"
                android:layout_height="wrap_content"
                android:text="Đăng Ký"
                android:textSize="20dp">

            </Button>
        </LinearLayout>
    </RelativeLayout>

        * */
    }

    private void mainOn(){
        /*
        --Dung Taget->Nhan Thuong

            +Line 98:
                            String id=prefs.getString("id", "");
                            if(!id.equals(usersc.idus)){
                                Random rd=new Random();
                                int i=rd.nextInt(10)+10;
                                SharedPreferences.Editor editors = prefs.edit();
                                editors.putInt("target", usersc.score+i);
                                editors.putString("id",usersc.idus);
                                editors.apply();
                            }


        ---//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
//
//        bottomNavigationView.setSelectedItemId(R.id.action_home);
//
//        //nhấp chuột vào 3 icon ở dưới cùng
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch(item.getItemId()){
//                    case R.id.action_home:
//                        return true;
//
//                    case R.id.action_score:
//                        startActivity(new Intent(getApplicationContext()
//                                ,HighScore.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                    case R.id.action_user:
//                        startActivity(new Intent(getApplicationContext()
//                                ,User.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                }
//                return false;
//            }
//        });

--Nhạc
line 76:
                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean("isMute", isMute);
                editor.apply();


    ---Quan:
        Hien thi lan choi 1:
        //nut đếm số lần đã chơi game
        btnDemSoLanDaChoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy số lần chơi từ SharedPreferences và hiển thị
                int soLanChoi = prefs.getInt("soLanChoi", 0);
                SoLanChoi.setText("Số lần chơi: " + soLanChoi);
            }
        });

        // Nhấn vào chơi game
        //Nhấn vào chơi game

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Khi nhấn nút play, tăng số lần chơi lên 1 và cập nhật vào SharedPreferences
                int soLanChoi = prefs.getInt("soLanChoi", 0) + 1;
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("soLanChoi", soLanChoi);
                editor.apply();

                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }
        });
    }


                cách hiển thị số lần chơi game 2
//                play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Khi nhấn nút play, tăng số lần chơi lên 1 và cập nhật vào SharedPreferences
//                int soLanChoi = prefs.getInt("soLanChoi", 0) + 1;
//                SharedPreferences.Editor editor = prefs.edit();
//                editor.putInt("soLanChoi", soLanChoi);
//                editor.apply();
//
//                // Hiển thị số lần chơi
//                SoLanChoi.setText("Số lần chơi: " + soLanChoi);
//                startActivity(new Intent(MainActivity.this, GameActivity.class));
//            }
//        });
//
//        cre.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, credit.class));
//            }
//        });



        //runTimer();

//    }

//    public void runTimer(){
//        //create text view
//        final TextView timeView = findViewById(R.id.time_view);
//
//        //create Handler
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = second / 3600;
//                int minutes = (second % 3600)/60;
//                int secs = second % 60;
//
//                String time = String.format(Locale.getDefault(),
//                        "%d:%02d:%02d",hours,
//                        minutes, secs);
//
//                timeView.setText(time);
//                if(running){
//                    second++;
//                }
//                handler.postDelayed(this,1000);
//
//            }
//        });
//    }
//}
         */


    }

    private void HightOn(){
        /*
        -Huy chuong dẹp:
        //        listScore.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item = (String) parent.getItemAtPosition(position);
//
//                // Hiển thị dialog với thông tin tương ứng
//                showDialogWithInfo(item);
//            }
//        });



        //----New----
        //FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();-Kbao
        //private int[] imageResources;--Kbao
       /* myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear(); // Clear the old list before updating
                int i=0;
                ArrayList<MedalUser> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {

                    if (snapshot.hasChild("name") && snapshot.hasChild("score")&&snapshot.hasChild("idus")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String id=snapshot.child("idus").getValue().toString();
                        String item = name + " - " + score;

                        tempList.add(new MedalUser(item,R.drawable.md4,id));
                    }
                }

                // Sort the temporary list based on scores
                Collections.sort(tempList, new Comparator<MedalUser>() {
                    @Override
                    public int compare(MedalUser s1, MedalUser s2) {
                        int score1 = Integer.parseInt(s1.getName().split(" - ")[1].trim());
                        int score2 = Integer.parseInt(s2.getName().split(" - ")[1].trim());
                        return Integer.compare(score2, score1);
                    }
                });

                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

                for (int x = 0; x < tempList.size(); x++) {
                    //int position = x + 1;
                    MedalUser score = tempList.get(x);

                    if (x == 0) {
                        score.setImageResource(R.drawable.md1);
                    } else if (x == 1) {
                        score.setImageResource(R.drawable.md2);
                    } else if (x == 2) {
                        score.setImageResource(R.drawable.md3);
                    }else{
                        if(score.getId().equals(firebaseUser.getUid())){
                            score.setImageResource(R.drawable.md5);
                        }else{
                            score.setImageResource(R.drawable.md4);
                        }

                    }

                    //tempList.add(score);
                }

                displayUserListWithMedals(tempList);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        --Cach Quynh:

            +Kbao:
            //nut tim kiem
    Button btnTimKiemTheoTen, btnTimKiemTheoDiemChinhXac, btnTimKiemTheoKhoangDiem;

    //nut sap xep
    Button btnSapXepNguoiChoiTheoTenAZ, btnSapXepNguoiChoiTheoTenZA;
    //nut top 5
    Button btnTop5NguoiChoiDiemCaoNhat, btnTop5NguoiChoiCoDiemThapNhat;
    //nut top 1
    Button btnNguoiChoiDiemCaoNhat, btnNguoiChoiDiemThapNhat;

    EditText editTextTimKiemTheoTen, editTextTimKiemTheoDiemChinhXac, editTextDiemTu, editTextDiemDen;
    //nut sap xep diem
    Button btnSapXepDiemCaoThap, btnSapXepDiemThapCao;

         +Ktao:
            //nut tim kiem
        btnTimKiemTheoTen = findViewById(R.id.btnTimKiemTheoTen);
        btnTimKiemTheoDiemChinhXac = findViewById(R.id.btnTimKiemTheoDiemChinhXac);
        btnTimKiemTheoKhoangDiem = findViewById(R.id.btnTimKiemTheoKhoangDiem);

        //nut sap xep
        btnSapXepNguoiChoiTheoTenAZ = findViewById(R.id.btnSapXepNguoiChoiTheoTenAZ);
        btnSapXepNguoiChoiTheoTenZA = findViewById(R.id.btnSapXepNguoiChoiTheoTenZA);

        //nút top 5
        btnTop5NguoiChoiDiemCaoNhat = findViewById(R.id.btnTop5NguoiChoiDiemCaoNhat);
        btnTop5NguoiChoiCoDiemThapNhat = findViewById(R.id.btnTop5NguoiChoiDiemThapNhat);

        //nut top 1
        btnNguoiChoiDiemCaoNhat = findViewById(R.id.btnNguoiChoiCaoDiemNhat);
        btnNguoiChoiDiemThapNhat = findViewById(R.id.btnNguoiChoiThapDiemNhat);
        //edit text
        editTextTimKiemTheoTen = findViewById(R.id.editTextTimKiemTheoTen);
        editTextTimKiemTheoDiemChinhXac = findViewById(R.id.editTextTimkiemTheoDiemChinhXac);
        editTextDiemTu = findViewById(R.id.editTextDiemTu);
        editTextDiemDen = findViewById(R.id.editTextDiemDen);

        //nut sap xep diem
        btnSapXepDiemCaoThap = findViewById(R.id.btnSapXepTheoDiemCaoThap) ;
        btnSapXepDiemThapCao = findViewById(R.id.btnSapXepTheoDiemThapCao);

       +Trien Khai:
         //nút tìm kiếm theo tên người dùng
        btnTimKiemTheoTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchText = editTextTimKiemTheoTen.getText().toString().trim();
                if (!searchText.isEmpty()) {
                    searchByName(searchText);
                } else {
                    // Nếu ô tìm kiếm trống, hiển thị toàn bộ danh sách
                    updateListView(mang);
                }
            }
        });

        //nút tìm kiếm theo điểm người dùng
        btnTimKiemTheoDiemChinhXac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchScoreText = editTextTimKiemTheoDiemChinhXac.getText().toString().trim();
                if (!searchScoreText.isEmpty()) {
                    searchByScore(searchScoreText);
                } else {
                    // Nếu ô tìm kiếm trống, hiển thị toàn bộ danh sách
                    updateListView(mang);
                }
            }
        });
        //nút tìm kiếm theo khoảng điểm người dùng
        btnTimKiemTheoKhoangDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diemTuText = editTextDiemTu.getText().toString().trim();
                String diemDenText = editTextDiemDen.getText().toString().trim();

                if (!diemTuText.isEmpty() && !diemDenText.isEmpty()) {
                    searchByScoreRange(diemTuText, diemDenText);
                } else {
                    // Nếu ô tìm kiếm trống, hiển thị toàn bộ danh sách
                    updateListView(mang);
                }
            }
        });


        //nút sắp xếp người chơi theo tên từ a - z
        btnSapXepNguoiChoiTheoTenAZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortPlayerNamesAZ();
            }
        });

        //nút sắp xếp người chơi theo tên từ z - a
        btnSapXepNguoiChoiTheoTenZA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortPlayerNamesZA();
            }
        });
        //nut top 5 người choi điểm cao nhất
        btnTop5NguoiChoiDiemCaoNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTop5Players();
            }
        });

        //nut top 5 người chơi điểm thấp nhất
        btnTop5NguoiChoiCoDiemThapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTop5PlayersWithLowestScore();
            }
        });
        //nut top 1 người chơi có điểm cao nhất
        btnNguoiChoiDiemCaoNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPlayerWithHighestScore();
            }
        });

        //nut top 1 người chơi có điểm thấp nhất
        btnNguoiChoiDiemThapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPlayerWithLowestScore();
            }
        });

        //nut sap xep diem tu cao xuong thap
        btnSapXepDiemCaoThap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortPlayerScoresHighToLow();
            }
        });
        //sap xep diem thap cao
        btnSapXepDiemThapCao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortPlayerScoresLowToHigh();
            }
        });
        //cau hinh list view

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                mang);
        listScore.setAdapter(adapter);

        // Bắt sự kiện
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear(); // Clear the old list before updating

                ArrayList<String> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String item = name + " : " + score;
                        tempList.add(item);
                    }
                }

                // Sort the temporary list based on scores
                Collections.sort(tempList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                        int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                        return Integer.compare(score2, score1);
                    }
                });

                // Populate the final list with sorted items and display the rank
                for (int i = 0; i < tempList.size(); i++) {
                    String item = (i + 1) + ". " + tempList.get(i);
                    mang.add(item);
                }

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


    }
    //Tìm kiếm theo tên người dùng
    private void searchByName(String name) {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String userName = snapshot.child("name").getValue().toString();
                        if (userName.toLowerCase().contains(name.toLowerCase())) {
                            // Nếu tìm thấy tên trong danh sách, thêm vào danh sách tạm thời
                            String score = snapshot.child("score").getValue().toString();
                            String item = userName + " : " + score;
                            tempList.add(item);
                        }
                    }
                }

                // Cập nhật danh sách hiển thị với nội dung của tempList
                mang.addAll(tempList);

                // Cập nhật ListView để hiển thị kết quả tìm kiếm
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }


    private void updateListView(ArrayList<String> dataList) {
        // Cập nhật danh sách hiển thị
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                dataList);
        listScore.setAdapter(adapter);
    }

    //Tìm kiếm theo điểm người dùng
    private void searchByScore(String score) {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String userScore = snapshot.child("score").getValue().toString();
                        if (userScore.equals(score)) {
                            // Nếu tìm thấy điểm trong danh sách, thêm vào danh sách tạm thời
                            String userName = snapshot.child("name").getValue().toString();
                            String item = userName + " : " + userScore;
                            tempList.add(item);
                        }
                    }
                }

                // Cập nhật danh sách hiển thị với nội dung của tempList
                mang.addAll(tempList);

                // Cập nhật ListView để hiển thị kết quả tìm kiếm
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    //tìm kiếm theo khoảng đieerm người dùng
    private void searchByScoreRange(String diemTu, String diemDen) {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String userScore = snapshot.child("score").getValue().toString();
                        int diemTuValue = Integer.parseInt(diemTu);
                        int diemDenValue = Integer.parseInt(diemDen);
                        int userScoreValue = Integer.parseInt(userScore);

                        if (userScoreValue >= diemTuValue && userScoreValue <= diemDenValue) {
                            // Nếu tìm thấy điểm trong khoảng, thêm vào danh sách tạm thời
                            String userName = snapshot.child("name").getValue().toString();
                            String item = userName + " : " + userScore;
                            tempList.add(item);
                        }
                    }
                }

                // Cập nhật danh sách hiển thị với nội dung của tempList
                mang.addAll(tempList);

                // Cập nhật ListView để hiển thị kết quả tìm kiếm
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    //sap xep nguoi choi theo ten a-z
    private void sortPlayerNamesAZ() {
        Collections.sort(mang, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Sử dụng regex để tìm và so sánh tên người chơi
                String name1 = s1.replaceAll("[^a-zA-Z]", "").trim();
                String name2 = s2.replaceAll("[^a-zA-Z]", "").trim();
                return name1.compareToIgnoreCase(name2);
            }
        });

        updateListView(mang);
    }

    //sap xep nguoi choi theo ten z-a
    private void sortPlayerNamesZA() {
        Collections.sort(mang, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Sử dụng regex để tìm và so sánh tên người chơi
                String name1 = s1.replaceAll("[^a-zA-Z]", "").trim();
                String name2 = s2.replaceAll("[^a-zA-Z]", "").trim();
                return name2.compareToIgnoreCase(name1); // Đổi chỗ name1 và name2 để sắp xếp từ Z đến A
            }
        });

        updateListView(mang);
    }

    //code hiển thị top 5 người chơi có điểm cao nhất
    // Hàm hiển thị top 5 người chơi có điểm cao nhất
    private void showTop5Players() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Danh sách tạm thời để lưu top 5

                // Thêm tất cả người chơi vào danh sách tạm thời
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String item = name + " : " + score;
                        tempList.add(item);
                    }
                }

                // Sắp xếp danh sách tạm thời theo điểm giảm dần
                Collections.sort(tempList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                        int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                        return Integer.compare(score2, score1);
                    }
                });

                // Hiển thị chỉ top 5 người chơi
                int count = Math.min(tempList.size(), 5);
                for (int i = 0; i < count; i++) {
                    String item = (i + 1) + ". " + tempList.get(i);
                    mang.add(item);
                }

                // Cập nhật danh sách hiển thị
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    //code top 5 người điểm chơi thấp nhất
    private void showTop5PlayersWithLowestScore() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Danh sách tạm thời để lưu top 5

                // Thêm tất cả người chơi vào danh sách tạm thời
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String item = name + " : " + score;
                        tempList.add(item);
                    }
                }

                // Sắp xếp danh sách tạm thời theo điểm tăng dần
                Collections.sort(tempList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                        int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                        return Integer.compare(score1, score2);
                    }
                });

                // Hiển thị chỉ top 5 người chơi
                int count = Math.min(tempList.size(), 5);
                for (int i = 0; i < count; i++) {
                    String item = (i + 1) + ". " + tempList.get(i);
                    mang.add(item);
                }

                // Cập nhật danh sách hiển thị
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    // Hàm hiển thị người chơi có điểm cao nhất
    private void showPlayerWithHighestScore() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();

                String highestScorePlayer = ""; // Biến lưu thông tin người chơi có điểm cao nhất
                int highestScore = Integer.MIN_VALUE; // Biến lưu điểm cao nhất

                // Tìm người chơi có điểm cao nhất
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String scoreString = snapshot.child("score").getValue().toString();
                        int score = Integer.parseInt(scoreString);

                        if (score > highestScore) {
                            highestScore = score;
                            highestScorePlayer = name + " : " + scoreString;
                        }
                    }
                }

                // Hiển thị thông tin người chơi có điểm cao nhất
                if (!highestScorePlayer.isEmpty()) {
                    mang.add(highestScorePlayer);
                }

                // Cập nhật danh sách hiển thị
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    // Hàm hiển thị người chơi có điểm thấp nhất
    private void showPlayerWithLowestScore() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();

                String lowestScorePlayer = ""; // Biến lưu thông tin người chơi có điểm thấp nhất
                int lowestScore = Integer.MAX_VALUE; // Biến lưu điểm thấp nhất

                // Tìm người chơi có điểm thấp nhất
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String scoreString = snapshot.child("score").getValue().toString();
                        int score = Integer.parseInt(scoreString);

                        if (score < lowestScore) {
                            lowestScore = score;
                            lowestScorePlayer = name + " : " + scoreString;
                        }
                    }
                }

                // Hiển thị thông tin người chơi có điểm thấp nhất
                if (!lowestScorePlayer.isEmpty()) {
                    mang.add(lowestScorePlayer);
                }

                // Cập nhật danh sách hiển thị
                updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }

    // Phương thức sắp xếp điểm từ cao xuống thấp
    private void sortPlayerScoresHighToLow() {
        Collections.sort(mang, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                return Integer.compare(score2, score1);
            }
        });

        updateListView(mang);
    }

    // Phương thức sắp xếp điểm từ thấp lên cao
    private void sortPlayerScoresLowToHigh() {
        Collections.sort(mang, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                return Integer.compare(score1, score2);
            }
        });

        updateListView(mang);
    }

        -View:


         */
    }

    private void GamV(){
        /*
        --Nhạc
        if (!prefs.getBoolean("isMute", false))
           soundPool.play(sound, 1, 1, 0, 0, 1);

        --Chơi xong hỏi:
         public void notifyGameEnd(int score) {
        //((GameActivity) getContext()).showEndGameDialog(score);
        //activity.showEndGameDialog(score);

        isGameOver = true;

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //activity.showEndGameDialog(score);
                ((GameActivity) getContext()).showEndGameDialog(score);
            }
        }, 1000); // Trì hoãn hiển thị dialog 1 giây
    }

    --OntouchEvent:
    switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if(x.contains((int)event.getX(),(int)event.getY())||x2.contains((int)event.getX(),(int)event.getY())){
                   flight.toShoot++;
//                    isFiring=true;
//                    fire();
                }
//                 previousX = currentX;
//                 previousY = currentY;
//                 offsetX = 0;
//                 offsetY = 0;
                break;

//            case MotionEvent.ACTION_MOVE:
//                // Tính toán khoảng cách di chuyển
//                offsetX = currentX - previousX;
//                offsetY = currentY - previousY;
//
//                // Cập nhật tọa độ trước đó
//                previousX = currentX;
//                previousY = currentY;
//
//                // Di chuyển đối tượng theo khoảng cách
//                moveObject(offsetX, offsetY);
//                break;
//            case MotionEvent.ACTION_UP:
//                isFiring=false;
//                 fire();
//                break;
        }

        --Hien Name:

//            paint.setTextSize(50);
//            paint.setColor(Color.GREEN);
//            paint.setFakeBoldText(true);

            //canvas.drawText(name+"", flight.x, flight.y, paint);

         --Hien ngay gio:

         LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    String currentDates = dateFormatter.format(currentDateTime);
            String currentTime = timeFormatter.format(currentDateTime);

            canvas.drawText( ""+currentTime+":"+currentDates,screenX / 3f, 100, paint);

            --Dem tien:
            Kbao
            private Handler handler;
    private long gameTimeInMillis;  // Thời gian chơi tính bằng mili giây
    private long elapsedTimeInMillis;  // Thời gian đã trôi qua tính bằng mili giây

    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

    String elapsedTime ;

    Ktao:

        gameTimeInMillis = 60000;  // Ví dụ: 60 giây
        elapsedTimeInMillis = 0;

        // Khởi tạo Handler và bắt đầu tăng thời gian
        handler = new Handler();
        startElapsedTime();

      TKhai:
      @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        // Hủy bỏ Handler khi GameView bị loại bỏ
        stopElapsedTime();
    }

    private void startElapsedTime() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Tăng thời gian đã trôi qua
                elapsedTimeInMillis += 1000;  // Tăng 1 giây (1000 mili giây)
                // Vẽ thời gian đã trôi qua lên canvas

                // Tiếp tục tăng thời gian sau 1 giây
                startElapsedTime();
            }
        }, 1000);  // 1 giây (1000 mili giây)
    }

    private void stopElapsedTime() {
        handler.removeCallbacksAndMessages(null);
    }
---->Draw
paint.setColor(Color.RED);
            elapsedTime = formatElapsedTime(elapsedTimeInMillis);;

            //String elapsedTime = timeFormat.format(new Date(elapsedTimeInMillis));

            canvas.drawText(elapsedTime + "", screenX / 5f, 100, paint);

private String formatElapsedTime(long elapsedTimeInMillis) {
        // Chia thời gian thành giờ, phút và giây
        long hours = TimeUnit.MILLISECONDS.toHours(elapsedTimeInMillis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTimeInMillis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTimeInMillis) % 60;

        // Định dạng giờ, phút và giây thành chuỗi có định dạng hh:mm:ss
        String formattedTime = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);

        return formattedTime;
    }
         */
    }

    private void GameAc(){
        /*
        --Đụng ra ngoài:
            +C1: Khả dụng:
            View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                // Kiểm tra trạng thái của giao diện người dùng
                if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                    showDialog();
                }
                    //CustomDialog.showAlertDialog(MainActivity.this, "Vui lòng không ấn vào các nút bên ngoài màn hình khi đang chơi.");
                }

        });

        private void showDialog() {
        if (!isDialogShown) {
        // Hiển thị dialog cảnh báo
        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
        builder.setTitle("Cảnh báo");
        builder.setMessage("Vui lòng không ấn vào các nút bên ngoài màn hình khi đang chơi.");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Xử lý khi người dùng nhấn nút Đồng ý
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();}
    }
    @Override
    public void onBackPressed() {

        gameView.ckeckck=true;
        //
        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
        builder.setTitle("Cảnh báo");
        builder.setMessage("Vui lòng không ấn vào các nút bên ngoài màn hình khi đang chơi.");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Xử lý khi người dùng nhấn nút Đồng ý
                gameView.ckeckck=false;
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    +C2: K Khả quan:
    )Kbao:
     private boolean isDialogShown = false;

    private AlertDialog alertDialog;

    )Ktao:
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);

getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(
                new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            // Màn hình cảnh báo đã bị tắt
                            dismissAlertDialog();
                        }
                    }
                });

     public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_APP_SWITCH) {
            showAlertDialog();
            return true; // Ngăn chặn sự kiện mặc định của nút Multitasking
        }
        return super.onKeyDown(keyCode, event);
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cảnh báo");
        builder.setMessage("Bạn đã ấn Multitasking!");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                dismissAlertDialog();
            }
        });

        alertDialog = builder.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
    }

    ----Gameover: Hỏi:
    C1:
     //-----------------------------------
//        builder.setTitle("Game Over");
//        builder.setMessage("Your Score: " + score);
//
//        // Thêm nút "Play Again"
//        builder.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Xử lý khi người chơi chọn chơi lại
//                // Start new game or reset game state
//                //gameView.pause();
//                recreate();
//
//
//
//            }
//        });

        // Thêm nút "Quit"
//        builder.setNegativeButton("Quit", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Xử lý khi người chơi chọn thoát
//                // Finish current activity or navigate to another screen
//                //gameView.waitBeforeExiting();
//                //gameView.pause();
//
//                finish();
//            }
//        });


        // Hiển thị dialog
        //builder.show();
        Ciết trong showEndGameDialog

///-------------------------------
C2:
public void showEndGameDialog(int score) {
        // Tạo dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setView(R.layout.custom_dialog_layout);

        AlertDialog dialog = builder.create();
        dialog.show();

        TextView textScore = dialog.findViewById(R.id.text_score);
        textScore.setText("Your Score: " + score);

        Button buttonPlayAgain = dialog.findViewById(R.id.button_play_again);
        buttonPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chạy lại activity
                dialog.cancel();
                recreate();
            }
        });

        Button buttonQuit = dialog.findViewById(R.id.button_quit);
        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kết thúc activity
                finish();
            }
        });


    }

---Dem nguoc Tgian
Kbao
private CountDownTimer countDownTimer;
    private AlertDialog alertDialogc;

    Ktao:
    long countdownDuration = 1500000;
        long countdownInterval = 1000;

        countDownTimer = new CountDownTimer(countdownDuration, countdownInterval) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Cập nhật giao diện ngược thời gian ở đây (ví dụ: TextView)
                //gameView.nexttime = millisUntilFinished / 1000;
                long seconds = millisUntilFinished / 1000;
                long minutes = seconds / 60;
                long hours = minutes / 60;

                String timeLeft = String.format("%02d:%02d:%02d",
                        hours % 24, minutes % 60, seconds % 60);

                gameView.nextTime=timeLeft;
                //countdownTextView.setText(timeLeft);

            }

            @Override
            public void onFinish() {
                // Hiển thị dialog khi thời gian kết thúc
                //countdownTextView.setText("00:00:00");\
                gameView.nextTime="00:00:00";
                //showDialogc();
            }
        };

        // Bắt đầu đếm ngược thời gian
        countDownTimer.start();

        +TThi:
            @Override
    protected void onDestroy() {
        super.onDestroy();

        // Hủy bỏ đếm ngược thời gian và đóng dialog (nếu đang hiển thị)
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    private void showDialogc() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông báo");
        builder.setMessage("Thời gian đã kết thúc!");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                // Xử lý khi dialog đóng (nếu cần)
            }
        });

        alertDialog = builder.create();
        alertDialog.show();
    }

         */
    }


}

