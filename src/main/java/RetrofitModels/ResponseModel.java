
package RetrofitModels;

import java.io.Serializable;

public class ResponseModel implements Serializable {
    private String id;
    private String name;
    private String desc;
    private Object descData;
    private Boolean closed;
    private String idOrganization;
    private Object idEnterprise;
    private Boolean pinned;
    private String url;
    private String shortUrl;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Object getDescData() {
        return descData;
    }
    public void setDescData(Object descData) {
        this.descData = descData;
    }
    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
    public String getIdOrganization() {
        return idOrganization;
    }
    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }
    public Object getIdEnterprise() {
        return idEnterprise;
    }
    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }
    public Boolean getPinned() {
        return pinned;
    }
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getShortUrl() {
        return shortUrl;
    }
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

}

