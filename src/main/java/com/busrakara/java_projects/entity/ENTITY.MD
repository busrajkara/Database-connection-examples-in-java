# Öğrenci Sınıfı ve JPA Anotasyonları Hakkında Bilgi

Bu belge, `Students` sınıfı için kullanılan anotasyonlar, alanlar, getter/setter metodları ve genel yapıyı açıklamaktadır.

## 1. Annotationlar (Ek açıklamalar)

- **@Entity**: Bu ek açıklama, `Students` sınıfının bir veritabanı tablosu ile eşleştiğini belirtir. Yani, bu sınıf veritabanında bir tabloya karşılık gelir.

- **@Id**: Bu, tablodaki birincil anahtarı (primary key) işaret eder. `id` alanı bu tablodaki birincil anahtar olacaktır.

- **@GeneratedValue(strategy = GenerationType.AUTO)**: Bu, birincil anahtarın otomatik olarak veritabanı tarafından oluşturulacağını belirtir. `id` alanı her yeni kayıt eklendiğinde veritabanı tarafından otomatik olarak atanacaktır.

## 2. Alanlar (Fields)

- `private Long id`: Öğrencinin benzersiz kimlik numarasıdır. Bu, veritabanındaki satırları benzersiz bir şekilde tanımlamak için kullanılır.

- `private String name`: Öğrencinin adını tutan alandır.

- `private String surname`: Öğrencinin soyadını tutan alandır.

- `private Integer no`: Öğrencinin numarasını tutan alandır.

- `private Integer classNo`: Öğrencinin sınıfını belirten bir alandır.

- `private Integer branch`: Öğrencinin ait olduğu şubeyi tutan bir alandır.

## 3. Getter ve Setter Metodları

Bu sınıf, her bir alan için getter ve setter metodları sağlar:

- **Getter**: Bir alanın değerini okumak için kullanılır. Örneğin, `getName()` metodu öğrenci ismini döner.

- **Setter**: Bir alanın değerini güncellemek için kullanılır. Örneğin, `setName(String name)` metodu öğrenci ismini değiştirmek için kullanılır.

## Özetle

Bu sınıf, bir öğrenci nesnesini temsil ediyor ve JPA ile veritabanına kaydedilip oradan alınabilecek bir varlık (entity) olarak işlev görüyor. Veritabanında bu sınıfa karşılık gelen bir tablo oluşturulacak ve her bir öğrenci bu tabloya bir satır olarak kaydedilecektir.
