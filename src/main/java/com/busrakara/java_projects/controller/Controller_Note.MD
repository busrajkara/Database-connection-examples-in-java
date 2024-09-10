# StudentsController
StudentsController, öğrencilerle ilgili HTTP isteklerini yöneten bir RESTful controller sınıfıdır. Öğrenci kaydı oluşturma ve öğrencileri listeleme işlemleri için kullanılır. Spring Boot kullanılarak geliştirilmiştir.

### Amaç
Bu denetleyici, HTTP isteklerine yanıt verir ve öğrenci verilerini yönetir. İki temel işlevi vardır:

Yeni öğrenci eklemek (POST /students/create)
Tüm öğrencileri listelemek (GET /students/list)
Sınıf Yapısı
1. createStudents(Students students) - POST
   Bu metod, yeni bir öğrenci oluşturmak için kullanılır.

#### Endpoint: /students/create
HTTP Metodu: POST
Parametre:
@RequestBody Students students: İstek gövdesinden alınan öğrenci nesnesi.
İşleyiş:
Öğrenci nesnesi studentsService.createStudens(students) ile veritabanına kaydedilir.
İşlem başarılı olursa true döner.
2. listStudents() - GET
   Bu metod, veritabanındaki tüm öğrencileri listelemek için kullanılır.

- Endpoint: /students/list
- HTTP Metodu: GET
- Dönüş: List<Students>: Öğrencilerin listesini döner. 
### Örnek API Kullanımı 
 ###### Yeni öğrenci eklemek için:
 + İstek: POST /students/create
 + İçerik (JSON)
````json
[
 {
  "name": "John",
  "surname": "Doe",
  "no": 123,
  "classNo": 4,
  "branch": 1
  }
]
````

   
``` textmate 
Yanıt: true (Başarılı olursa)
```


  ###### Tüm öğrencileri listelemek için:
- İstek: GET /students/list
- Yanıt (JSON): 

   ```json
   [
   {
   "id": 1,
   "name": "John",
   "surname": "Doe",
   "no": 123,
   "classNo": 4,
   "branch": 1
   },
   {
   "id": 2,
   "name": "Jane",
   "surname": "Smith",
   "no": 124,
   "classNo": 3,
   "branch": 2
   }
   ]
   ```

