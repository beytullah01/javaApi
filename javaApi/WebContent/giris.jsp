<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

<style>

#container

    {

         width: 100px;
         height: 100px;
         background-color: #567;
         position: absolute;
         left: 40%;
         top: 50%;
         margin-left: -75px;
         margin-top: -50px;

    }

</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="container">
  <div class="card" style="width: 18rem;">
<form action="kisiController" method="post">

  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">kullanıcı adı:</label>
    <input type="email" class="form-control" name="kullaniciAdi" placeholder="kullanıcı adını giriniz">
  
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">şifre:</label>
    <input type="password" class="form-control" name="sifre" placeholder="kullanıcı sifrenizi giriniz">
  </div>

  <button type="submit" style="margin-left:75px;" class="btn btn-primary">giriş yap</button>
  <a href="kayitOl.jsp">mukellef ol</a>
 
</form>
 </div>
</div>


</body>
</html>