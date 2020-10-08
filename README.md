# springboot-tutorial

list api beserta fungsinya :

Customer
  GET Method :
    GET /customer = untuk menampilkan seluruh list customer
    GET /customer/{id} = untuk menampilkan 1 customer berdasarkan id tertentu
    GET /customer/name/{name} = untuk menampilkan 1 customer berdasarkan namanya
    GET /customer/gender/{gender} = untuk menampilkan list customer difilter berdasarkan gender
    GET /customer/priority/{priority} = untuk menampilkan list customer difilter berdasarkan status prioritasnya
    
 POST Method :
    POST /customer = untuk menambahkan customer baru
      contoh format bodynya sebagai berikut
      {
	    "id": 5,
	    "name": "kevind",
	    "gender": "MALE",
	    "address": "tangerang",
	    "email": "kevin@gmail.com",
	    "phone": "12345",
	    "priority": "True"
	    }
    
 DELETE Method :
    DELETE /customer/{id} = untuk menghapus 1 customer berdasarkan id yang diinput
    
 PUT Method :
    PUT /customer/{id} = untuk mengedit satu customer yang sudah ada di list berdasarkan id yang diinput
      format bodynya sama seperti method POST
      
Credit Card
  GET Method :
    /customer/{id user}/cc = untuk melihat list kartu kredit yang dimiliki oleh 1 customer
    /customer/{id user}/cc/{nomor cc} = untuk melihat detail 1 kartu kredit yang dimiliki oleh suatu customer
    /customer/{id user}/cc/limit/{jumlah limit} = untuk melihat list kartu kredit yang dimiliki oleh 1 customer dengan filter jumlah limit
    /customer/{id user}/cc/tipe/{tipe kartu} = untuk melihat list kartu kredit yang dimiliki oleh 1 customer dengan filter jenis kartunya (silver, gold, platinum)
  
  POST Method :
    /customer/{id user}/cc = untuk menambahkan kartu kredit baru kepada 1 customer sesuai idnya
    
  DELETE Method :
    /customer/{id user}/cc/{nomor cc} = untuk menghapus 1 kartu kredit dari suatu customer sesuai idnya
    
  PUT Method :
    /customer/{id user}/cc/{nomor cc} = untuk mengedit 1 kartu kredit dari suatu customer sesuai idnya
  
