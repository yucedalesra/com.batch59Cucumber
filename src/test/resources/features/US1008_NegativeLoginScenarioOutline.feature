Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

  @negative
  Scenario Outline: TC13 kullanici gecerli bilgilerlegiris yapar
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    Then gecersiz username olarak "<username>" girer
    Then gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |username|password |
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|


