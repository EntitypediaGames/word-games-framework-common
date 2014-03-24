package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class IllegalClueDifficultyValueException extends GameFrameworkException {

    public IllegalClueDifficultyValueException(Object... params) {
        super(getFormattedMessage(IllegalWordDifficultyValueException.class.getSimpleName(), params));
        this.params = params;
    }
}
