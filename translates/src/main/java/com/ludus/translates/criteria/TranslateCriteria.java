package com.ludus.translates.criteria;

public class TranslateCriteria {
    private String baseText;
    private String category;
    private String lang;
    private String subCategory;
    private String content;
    private int version;
    
    public String getBaseText() {
        return baseText;
    }
    
    public void setBaseText(String baseText) {
        this.baseText = baseText;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getLang() {
        return lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public String getSubCategory() {
        return subCategory;
    }
    
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public int getVersion() {
        return version;
    }
    
    public void setVersion(int version) {
        this.version = version;
    }
}
