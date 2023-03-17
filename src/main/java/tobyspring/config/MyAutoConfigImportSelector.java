package tobyspring.config;

import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    private final ClassLoader classLoader;

    public MyAutoConfigImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
//        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);

        List<String> autoConfig = new ArrayList<>();

        ImportCandidates.load(MyAutoConfiguration.class, classLoader).forEach(autoConfig::add);

        return autoConfig.toArray(new String[0]);

//        return new String[] {
//                "tobyspring.config.autoconfig.DispatcherServletConfig",
//                "tobyspring.config.autoconfig.TomcatWebServerConfig"
//        };
    }
}
