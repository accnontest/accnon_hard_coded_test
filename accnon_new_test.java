public enum ServiceEndpoint {
    API_BASE("https://api.v2.rndm.com"),
    AUTH_SERVER("https://auth.socradar.io"),
    WEB_SOCKET("wss://stream.rndm.com");

    private final String url;

    ServiceEndpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
  
//This repository was generated for functional tests by SOCRadar Test Team.
