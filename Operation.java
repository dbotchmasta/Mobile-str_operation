package structures.operations;

import java.util.Date;

public abstract class Operation {
    
    private final Date dateopen;
    private final Date dateclose;
    private final int entityId;
    private final int optionsId;
    
    public Operation(Date dateopen, Date dateclose, int entityId, int optionsId) {
        this.dateopen = dateopen;
        this.dateclose = dateclose;
        this.entityId = entityId;
        this.optionsId = optionsId;
    }
    
    public Date getDateOpen() {
        return dateopen;
    }
    
    public Date getDateClose(){
        return dateclose;
    }
    
    public int getOptionsId() {
        return optionsId;
    }
        
    public int getEntityId() {
        return entityId;
    }
}
