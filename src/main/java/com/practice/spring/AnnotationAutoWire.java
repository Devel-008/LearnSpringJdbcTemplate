package com.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationAutoWire {

        private AutoWiring1 auto;
        public AutoWiring1 getAuto() {
            return auto;
        }
    @Autowired
        public void setAuto(AutoWiring1 auto) {
            this.auto = auto;
        System.out.println("SETTER injection ");
        }

        public AnnotationAutoWire(){
            super();
        }

        public AnnotationAutoWire(AutoWiring1 auto) {
            super();
            this.auto = auto;
            System.out.println("Constructor Called");
        }

        @Override
        public String toString() {
            return "AutoWiring{" +
                    "auto=" + auto +
                    '}';
        }
}
