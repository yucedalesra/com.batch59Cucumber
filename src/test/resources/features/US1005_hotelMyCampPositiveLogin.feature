Scenario: TC12 kullanici gecerli bilgilerle giris yapar

    @hmc
    Given kullanici Hotel My Camp ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir