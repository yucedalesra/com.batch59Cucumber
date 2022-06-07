Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "brcUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "cars" icerdigini test eder
    Then sayfayi kapatirir