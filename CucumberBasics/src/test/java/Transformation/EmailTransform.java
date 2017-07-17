package Transformation;

import cucumber.api.Transformer;

public class EmailTransform extends Transformer<String> {

    public String userName;

    @Override
    public String transform(String email) {
        return userName.concat("ea.com");
    }
}
