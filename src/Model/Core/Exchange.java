/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Core;

import java.util.Objects;

/**
 *
 * @author Llango
 */
public class Exchange 
{
    private String name;
    private String APIKey;
    private String URL;
    private String APIPersonal;    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.APIKey);
        hash = 37 * hash + Objects.hashCode(this.URL);
        hash = 37 * hash + Objects.hashCode(this.APIPersonal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exchange other = (Exchange) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.APIKey, other.APIKey)) {
            return false;
        }
        if (!Objects.equals(this.URL, other.URL)) {
            return false;
        }
        if (!Objects.equals(this.APIPersonal, other.APIPersonal)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAPIKey() {
        return APIKey;
    }

    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAPIPersonal() {
        return APIPersonal;
    }

    public void setAPIPersonal(String APIPersonal) {
        this.APIPersonal = APIPersonal;
    }
    

    
    
}
