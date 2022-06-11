Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And ofis bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
      |firstname|lastName|position|office|extension|startDate|salary|
      |Esra     |Nur     |qa      |newyork|UI       |2021-10-11|10000|
      |Alper    |Can     |tester  |dubai  |api      |2022-05-05|11000|
      |Omer     |Can     |BA      |berlin |-        |2022-07-10|40000|
      |Misto    |Mis     |PO      |newyork|-        |2022-03-12|45000|
      |Ayda     |Mis     |Tester  |berlin |database |2022-06-06|11000|