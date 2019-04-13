package org.sunflow.core.parameter.geometry;

import org.sunflow.SunflowAPIInterface;

public abstract class GeometryParameter extends ObjectParameter {

    public void setupInstance(SunflowAPIInterface api) {
        if (instanceParameter != null) {
            instanceParameter.name(name + ".instance");

            if (instanceParameter.geometry() == null) {
                instanceParameter.geometry(name);
            }

            instanceParameter.setup(api);
        }
    }

}
