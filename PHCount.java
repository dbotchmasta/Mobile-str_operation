package structures.operations;

import java.util.Date;

public class PHCount extends Operation {
    
    public PHCount(Date dateopen, Date dateclose, int clientId, int optionId) {
        super(dateopen, dateclose, clientId, optionId);
    }
}
