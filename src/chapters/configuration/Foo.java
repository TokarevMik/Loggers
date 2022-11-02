package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
    private static final Logger log = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        log.debug("Did it again! The Foo log");
    }
}
