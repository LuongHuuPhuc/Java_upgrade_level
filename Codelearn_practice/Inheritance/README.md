# Một vài lưu ý 
|Tính năng| Mô tả|
|---------|------|
|Từ khóa kế thừa | `extends`|

- Mỗi class chỉ kế thừa duy nhất 1 class cha (Java không hỗ trợ kế thừa đa class)
- Có thể kế thừa nhiều interface (Java hỗ trợ đa kế thừa qua interface)
- Constructor của cha luôn được gọi trước constructor con
- Dùng `super()` để gọi cha, `this` để gọi trong class hiện tại 