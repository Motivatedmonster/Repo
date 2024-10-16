// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class CryptoManager {
  private static final char LOWER_RANGE = ' ';
  private static final char UPPER_RANGE = '_';
  private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;
  public static void main(String[] args) {}
    
    

    /**
     * This method determines if a string is within the allowable bounds of ASCII codes 
     * according to the LOWER_RANGE and UPPER_RANGE characters
     * @param plainText a string to be encrypted, if it is within the allowable bounds
     * @return true if all characters are within the allowable bounds, false if any character is outside
     */
    public static boolean isStringInBounds (String plainText) {
      for (int i = 0; i < plainText.length(); i++) {
        char ch = plainText.charAt(i);
        if (ch > UPPER_RANGE || ch < LOWER_RANGE) {
            return false;
        }
      }
      return true;
    }
    
    

    /**
     * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in plainText is replaced by the character \"offset\" away from it 
     * @param plainText an uppercase string to be encrypted.
     * @param key an integer that specifies the offset of each character
     * @return the encrypted string
     */
  public static String caesarEncryption(String plainText, int key) {
    if (!isStringInBounds(plainText)) {
      return "The selected string is not in bounds, Try again.";
    }
    int i = 0;
    StringBuilder encryptedText = new StringBuilder();
    while (i < plainText.length()) {
        char ch = plainText.charAt(i);
      char newChar = (char) ((ch + key - LOWER_RANGE) % RANGE + LOWER_RANGE);
        encryptedText.append(newChar);

      i++;
    }
    return encryptedText.toString();

  }

    /**
     * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
     * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
     * to correspond to the length of plainText
     * @param plainText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the encrypted string
     */
    public static String bellasoEncryption (String plainText, String bellasoStr) {
      
      StringBuilder encryptedText = new StringBuilder();
      for (int i = 0; i < plainText.length(); i++) {
          char ch = plainText.charAt(i);
         int key = (int) bellasoStr.charAt(i % bellasoStr.length());
        char newChar = (char) ((ch + key - 2 * LOWER_RANGE) % RANGE + LOWER_RANGE);
        encryptedText.append(newChar);
      }
      return encryptedText.toString();
    }

    /**
     * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in encryptedText is replaced by the character \"offset\" characters before it.
     * This is the inverse of the encryptCaesar method.
     * @param encryptedText an encrypted string to be decrypted.
     * @param key an integer that specifies the offset of each character
     * @return the plain text string
     */
  public static String caesarDecryption (String encryptedText, int key) {
    if (!isStringInBounds(encryptedText)) {
      return "The selected string is not in bounds, Try again.";
    }
    StringBuilder decryptedText = new StringBuilder();
    for (int i = 0; i < encryptedText.length(); i++) {
      char ch = encryptedText.charAt(i);        
      char newChar = (char) ((ch + key - 2 * LOWER_RANGE) % RANGE + LOWER_RANGE);
      
      decryptedText.append(newChar);    
    }
    return decryptedText.toString();
  }

    /**
     * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
     * the character corresponding to the character in bellasoStr, which is repeated
     * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
     * @param encryptedText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the decrypted string
     */
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
      int i = 0;
      StringBuilder decryptedText = new StringBuilder();
      while (i < encryptedText.length()) {
          char ch = encryptedText.charAt(i);
          char keyChar = bellasoStr.charAt(i % bellasoStr.length());
        char newChar = (char) ((ch - keyChar + RANGE) % RANGE + LOWER_RANGE);

          decryptedText.append(newChar);
        i++;
      }
      return decryptedText.toString();
    }
      
    
  }

//@Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
