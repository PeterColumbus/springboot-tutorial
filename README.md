# springboot-tutorial

list api beserta fungsinya :

<p>
 Customer
<dl>
  <p>GET Method : </p>
    <dt>GET /customer = untuk menampilkan seluruh list customer</dt>
    <dt>GET /customer/{id} = untuk menampilkan 1 customer berdasarkan id tertentu</dt>
    <dt>GET /customer/name/{name} = untuk menampilkan 1 customer berdasarkan namanya</dt>
    <dt>GET /customer/gender/{gender} = untuk menampilkan list customer difilter berdasarkan gender</dt>
    <dt>GET /customer/priority/{priority} = untuk menampilkan list customer difilter berdasarkan status prioritasnya</dt>
   </dl> 
  
 <dl> 
 <p>POST Method : </p>
    <dt>POST /customer = untuk menambahkan customer baru</dt>
      contoh format bodynya sebagai berikut
      
      ```
      {
	    "id": 5,
	    "name": "kevind",
	    "gender": "MALE",
	    "address": "tangerang",
	    "email": "kevin@gmail.com",
	    "phone": "12345",
	    "priority": "True"
	    }
    '''
 </dl>
 <dl> 
        <p> DELETE Method : </p>
        <dt> DELETE /customer/{id} = untuk menghapus 1 customer berdasarkan id yang diinput </dt>
    
  <br>  
 <p>PUT Method : </p>
   <dt> PUT /customer/{id} = untuk mengedit satu customer yang sudah ada di list berdasarkan id yang diinput </dt>
      format bodynya sama seperti method POST
      </dl>
<br>      
<p>Credit Card
<p>GET Method : </p>
   <dt> /customer/{id user}/cc = untuk melihat list kartu kredit yang dimiliki oleh 1 customer
   <dt> /customer/{id user}/cc/{nomor cc} = untuk melihat detail 1 kartu kredit yang dimiliki oleh suatu customer
   <dt> /customer/{id user}/cc/limit/{jumlah limit} = untuk melihat list kartu kredit yang dimiliki oleh 1 customer dengan filter jumlah limit
    <dt> /customer/{id user}/cc/tipe/{tipe kartu} = untuk melihat list kartu kredit yang dimiliki oleh 1 customer dengan filter jenis kartunya (silver, gold, platinum) </dt>
  <br>
            <p>POST Method :</p>
    <dt>/customer/{id user}/cc = untuk menambahkan kartu kredit baru kepada 1 customer sesuai idnya </dt>
 <br>   
        <p>DELETE Method : </p>
    <dt>/customer/{id user}/cc/{nomor cc} = untuk menghapus 1 kartu kredit dari suatu customer sesuai idnya </dt>
    <br>
            <p>PUT Method : </p>
   <dt> /customer/{id user}/cc/{nomor cc} = untuk mengedit 1 kartu kredit dari suatu customer sesuai idnya
  
