# TP4DPBO2025C2
# Janji
Saya Kasyful Haq Bachariputra dengan NIM 2304820 mengerjakan Tugas Praktikum 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
Program ini terdiri dari tiga class:
## Mahasiswa
Atribut:
- nim
- nama
- jenisKelamin
- makananFavorit
Method:
- getter dan setter nim
- getter dan setter nama
- getter dan setter jenisKelamin
- getter dan setter makananFavorit
## Menu
Atribut:
- listMahasiswa
- mainPanel
- nimField
- namaField
- mahasiswaTable
- makananField
- addUpdateButton
- cancelButton
- jenisKelamin
- deleteButton
- titleLabel
- nimLabel
- namaLabel
- jeniskelaminLabel
- makanLabel
Method:
- Menu() -> constructor
- setTable()
- insertData()
- updateData()
- deleteData()
- clearForm()
- populateList()
## Database
Atribut:
- connection : Connection
- statement : Statement
Method:
- Database() -> Constructor
- selectQuery(String sql) : ResultSet -> Digunakan untuk melakukan query select
- insertUpdateDeleteQuery(String sql) : Int -> Digunakan untuk melakukan query insert, update, dan delete.
- getStatement() : Statemnet
- getConnection() : Connection
# Penjelasan Alur
Ketika program pertama dijalankan, dia akan membuat sebuah window di mana terdapat di dalamnya form dan sebuah tabel. Form berisi field nim, nama, jenisKelamin yang bertipe radio box, dan makananFavorit. Pada samping form, terdapat tombol add dan cancel. Apabila salah satu data diklik pada table, maka form akan diisi oleh datanya masing masing (misal, field nama akan diisi oleh atribut nama) dan akan mengubah tombol add menjadi update serta memunculkan tombol delete. Setiap kali melakukan add atau update pada data akan memunculkan dialogue box untuk menunjukkan bahwa add/update berhasil. Ketika klik tombol delete, akan muncul dialogue box sebagai konfirmasi, yang mana user dapat memiliki yes atau no. Apabila klik yes, maka akan menghapus data yang sedang dilihat dan menunjukkan dialogue box untuk menunjukkan bahwa delete berhassil. Apabila cancel diklik, maka akan melakukan clear form sehingga form pada setiap fieldnya akan kosong kembali.

# Dokumentasi
![1](Screenshoots\1.jpg)
![2](Screenshoots\2.jpg)
![3](Screenshoots\3.jpg)
![4](Screenshoots\4.jpg)
![5](Screenshoots\5.jpg)
![6](Screenshoots\6.jpg)
