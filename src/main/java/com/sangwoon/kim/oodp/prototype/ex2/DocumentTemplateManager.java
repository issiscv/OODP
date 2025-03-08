package com.sangwoon.kim.oodp.prototype.ex2;

import java.util.HashMap;
import java.util.Map;

public class DocumentTemplateManager {

    private static final Map<String, Document> templates = new HashMap<>();

    public static void addTemplate(String name, Document template) {
        templates.put(name, template);
    }

    public static Document createDocument(String templateName) {
        Document template = templates.get(templateName);
        if (template == null) {
            throw new IllegalArgumentException("No template with name " + templateName);
        }

        return (Document) template.clone();
    }

}
