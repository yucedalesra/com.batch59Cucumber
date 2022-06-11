
Feature: US1011 web tablosundaki istenen sutunu yazdirma

 @guru @pr2
 Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

  Given kullanici "guruUrl" anasayfasinda
  And kullanici 3 sn bekler
  And cookies sorulursa kabul eder
  And "% Change", sutunundaki tum degerleri yazdirir
  Then sayfayi kapatir
