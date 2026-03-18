1. the `@Name` annotation is not supported for the custom config properties:
the property names are suggested instead of the annotation values;
note that for the constructor binding this works correctly (in terms of resolving the property name).
The navigation from yaml to the config class property doesn't work for `@Name`-ed properties in this case also.
   - https://youtrack.jetbrains.com/issue/IDEA-384106/Harmonize-configuration-properties-support-to-all-target-objects
   - https://youtrack.jetbrains.com/issue/IDEA-386415/Spring-Boot-support-Name
   - https://youtrack.jetbrains.com/issue/IDEA-386778/Spring-Boot-Support-refactor-rename-feature-of-the-Name-annotated-configuration-properties
2. the underscores in the properties names are supported, with all notations;
however, there are no gutter navigation icons; navigation from yaml to the config class property doesn't work also.
   - https://youtrack.jetbrains.com/issue/IDEA-181168