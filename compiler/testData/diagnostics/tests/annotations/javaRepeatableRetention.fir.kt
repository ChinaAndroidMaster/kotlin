// FULL_JDK
// FILE: RepeatableAnnotation.java

import java.lang.annotation.*;

@Repeatable(RepeatableAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {
}

// FILE: RepeatableAnnotations.java

public @interface RepeatableAnnotations {
    RepeatableAnnotation[] value();
}

// FILE: RepeatableUse.kt

// Error should be gone when Java 8 Target will be available
@RepeatableAnnotation @RepeatableAnnotation class My
