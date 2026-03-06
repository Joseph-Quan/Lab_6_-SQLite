# 🎓 Ứng dụng Quản Lý Học Sinh (Student Manager)

Đây là một ứng dụng Android hoàn chỉnh giúp quản lý thông tin học sinh (CRUD) sử dụng cơ sở dữ liệu **SQLite**. Giao diện được thiết kế hiện đại với **Material Design 3**.

---

## 📸 Hình ảnh ứng dụng (Screenshots)

Để hiển thị hình ảnh tại đây, bạn hãy:
1. Tạo thư mục tên `screenshots` ở thư mục gốc của dự án.
2. Chụp ảnh màn hình điện thoại và lưu vào đó với tên `main_screen.png`.

| Giao diện chính | Danh sách học sinh |
| :---: | :---: |
| ![Main Screen](screenshots/main_screen.png) | ![List Screen](screenshots/list_screen.png) |

---

## 🚀 Tính năng nổi bật
- **✨ Thêm mới**: Nhập thông tin và lưu vào database chỉ với 1 chạm.
- **📋 Hiển thị**: Xem danh sách toàn bộ học sinh trực quan.
- **🛠 Cập nhật**: Chỉnh sửa thông tin học sinh theo ID.
- **🗑 Xóa**: Gỡ bỏ dữ liệu nhanh chóng.
- **🎨 Giao diện đẹp**: Sử dụng CardView, TextInputLayout và hiệu ứng Material.

## 🛠 Công nghệ sử dụng
- **Ngôn ngữ**: 
  - `Kotlin` (Xử lý logic Activity)
  - `Java` (Xử lý Database & Model)
- **Cơ sở dữ liệu**: SQLite
- **Thư viện UI**: Google Material Components

## 📂 Cấu trúc mã nguồn
- `MainActivity.kt`: Điều khiển các sự kiện nút bấm và giao diện.
- `DatabaseHandler.java`: Chứa các hàm truy vấn SQL (Insert, Update, Delete, Query).
- `Student.java`: Định nghĩa đối tượng học sinh.
- `activity_main.xml`: Thiết kế giao diện người dùng.

## 📝 Hướng dẫn sử dụng
1. **Mở dự án** trong Android Studio.
2. **Build và Chạy** ứng dụng trên máy ảo hoặc thiết bị thật.
3. **Thêm dữ liệu**: Nhập Tên, Địa chỉ, SĐT rồi nhấn "Thêm".
4. **Xem dữ liệu**: Nhấn "Xem DS" để hiện danh sách bên dưới.
5. **Sửa/Xóa**: Nhập ID của học sinh (số thứ tự) và thực hiện thao tác tương ứng.

---
*Phát triển bởi [Tên của bạn]*
