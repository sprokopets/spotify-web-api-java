package se.michaelthelin.spotify.models;

public class TokenResponse {

  private String accessToken;
  private String tokenType;
  private int expiresIn;
  private String refreshtoken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  public String getRefreshtoken() {
    return refreshtoken;
  }

  public void setRefreshtoken(String refreshtoken) {
    this.refreshtoken = refreshtoken;
  }
}
