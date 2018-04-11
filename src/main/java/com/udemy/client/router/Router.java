package com.udemy.client.router;


import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import elemental2.dom.NodeList;

import java.util.Objects;
import java.util.Optional;

public class Router {


    public static void init() {

        NodeList<Element> sections =  DomGlobal.document.getElementsByTagName("section");

        selectMainSection(sections);


        DomGlobal.window.onhashchange = (e) -> {

            String sectionName = DomGlobal.window.location.getHash().replace("#", "");

            Optional<Element> element = sections.asList().stream().filter(section -> Objects.equals(sectionName, section.getAttribute("name")))
                                      .findFirst();

            if (element.isPresent()) {
                HTMLElement section = (HTMLElement)element.get();
                unselectAll(sections);
                section.style.display = "";
                section.setAttribute("main", "");
                selectMainSection(sections);

            }
            return null;
        };



    }

    private static void unselectAll(NodeList<Element> sections) {
        sections.asList().stream().forEach(section -> section.removeAttribute("main"));
    }

    private static void selectMainSection(NodeList<Element> sections) {
        int mainSectionCounter = 0;
        for (int i = 0; i < sections.length; i++) {
            HTMLElement element = (HTMLElement) sections.item(i);

            if ( !element.hasAttribute("main") || mainSectionCounter > 0) {
                element.style.display = "none";
            } else {
                mainSectionCounter++;
            }

            if ( i == sections.length - 1 && mainSectionCounter == 0) {
                element = (HTMLElement) sections.item(0);
                element.setAttribute("main", "");
                element.style.display = "";
            }
        }
    }
}
