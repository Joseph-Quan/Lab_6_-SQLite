# 🎓 Ứng dụng Quản Lý Học Sinh (Student Manager)

Đây là một ứng dụng Android đơn giản giúp quản lý thông tin học sinh sử dụng cơ sở dữ liệu **SQLite**. Ứng dụng được thiết kế theo phong cách **Material Design 3** hiện đại.

## 🚀 Tính năng chính
- **Thêm học sinh**: Lưu tên, địa chỉ và số điện thoại.
- **Xem danh sách**: Hiển thị toàn bộ học sinh có trong cơ sở dữ liệu.
- **Sửa thông tin**: Cập nhật thông tin học sinh dựa trên ID.
- **Xóa học sinh**: Gỡ bỏ thông tin học sinh khỏi danh sách.

## 📸 Hình ảnh minh họa (Screenshots)

| Giao diện chính | Thêm & Hiển thị |
| :---: | :---: |
| <img src="screenshots/main_ui.png" width="300"> | <img src="screenshots/list_ui.png" width="300"> |

> *Lưu ý: Bạn hãy tạo thư mục `screenshots` trong thư mục gốc của dự án và bỏ các hình ảnh có tên tương ứng vào để hiển thị.*

## 🛠 Công nghệ sử dụng
- **Ngôn ngữ**: Kotlin (MainActivity) & Java (DatabaseHandler, Student).
- **Database**: SQLite (SQLiteOpenHelper).
- **UI**: Material Design components, CoordinatorLayout, CardView, TextInputLayout.

## 📂 Cấu trúc thư mục chính
- `app/src/main/java/com/example/hocsinh/`
  - `MainActivity.kt`: Xử lý logic và sự kiện nút bấm.
  - `DatabaseHandler.java`: Quản lý các câu lệnh SQL (CRUD).
  - `Student.java`: Lớp đối tượng (Model) cho Học sinh.
- `app/src/main/res/layout/`
  - `activity_main.xml`: Giao diện ứng dụng.

## 📝 Hướng dẫn cài đặt
1. Mở project trong **Android Studio**.
2. Đảm bảo đã cài đặt SDK phù hợp (API 24+).
3. Nhấn **Run** để chạy trên máy ảo hoặc thiết bị thật.

---
*Phát triển bởi [Tên của bạn]*
