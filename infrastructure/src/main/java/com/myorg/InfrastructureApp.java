package com.myorg;

import software.amazon.awscdk.App;

public final class InfrastructureApp {
    public static void main(final String[] args) {
        App app = new App();

        new InfrastructureStack(app, "JavaTemplateStack");

        app.synth();
    }
}
