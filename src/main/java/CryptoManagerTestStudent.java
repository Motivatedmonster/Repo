import org.junit.Assert;
import org.junit.Test;
public class CryptoManagerTestStudent {

  @Test
  public void testStringInBounds() {
    Assert.assertTrue(CryptoManager.isStringInBounds("FOUR"));  
      Assert.assertTrue(CryptoManager.isStringInBounds("\"FOUR IS FUN\""));
      Assert.assertFalse(CryptoManager.isStringInBounds("four"));
      Assert.assertFalse(CryptoManager.isStringInBounds("{four"));
      Assert.assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
    }

  @Test
  public void testEncryptCaesar() {
    Assert.assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
    Assert.assertEquals("FED", CryptoManager.caesarEncryption("CBA", 3));
    Assert.assertEquals("!\"#", CryptoManager.caesarEncryption("ABC", 96));
    Assert.assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
    Assert.assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
    Assert.assertEquals("WKLV#LV#DQRWKHU#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
  }

  @Test
  public void testDecryptCaesar() {
    Assert.assertEquals("TESTEST", CryptoManager.caesarDecryption("UFTUJOH", 1));
    Assert.assertEquals("TESTING ANOTHER STRING", CryptoManager.caesarDecryption(";,:;05.G(56;/,9G:;905.", 999));
    Assert.assertEquals("WORLD HELLO", CryptoManager.caesarDecryption("4188;LC;>80", 300));
    Assert.assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
  }

  @Test
  public void testEncryptBellaso() {
    Assert.assertEquals("WN#\\N &", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
    Assert.assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("CHRISTMAS MERRY", "HELLO"));
    Assert.assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));

  }

  @Test
  public void testDecryptBellaso() {
    Assert.assertEquals("TESTEST", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
    Assert.assertEquals("CHRISTMAS MERRY", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
    Assert.assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

  }

  }
