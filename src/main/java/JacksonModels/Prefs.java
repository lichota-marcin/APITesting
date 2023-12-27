package JacksonModels;

import java.util.ArrayList;
import java.util.List;

public class Prefs {
    private String permissionLevel;
    private Boolean hideVotes;
    private String voting;
    private String comments;
    private String invitations;
    private Boolean selfJoin;
    private Boolean cardCovers;
    private Boolean cardCounts;
    private Boolean isTemplate;
    private String cardAging;
    private Boolean calendarFeedEnabled;
    private List<Object> hiddenPluginBoardButtons = new ArrayList<Object>();
    private List<SwitcherView> switcherViews = new ArrayList<SwitcherView>();
    private String background;
    private String backgroundColor;
    private Object backgroundImage;
    private Boolean backgroundTile;
    private String backgroundBrightness;
    private Object backgroundImageScaled;
    private String backgroundBottomColor;
    private String backgroundTopColor;
    private Boolean canBePublic;
    private Boolean canBeEnterprise;
    private Boolean canBeOrg;
    private Boolean canBePrivate;
    private Boolean canInvite;
    public String getPermissionLevel() {
        return permissionLevel;
    }
    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
    public Boolean getHideVotes() {
        return hideVotes;
    }
    public void setHideVotes(Boolean hideVotes) {
        this.hideVotes = hideVotes;
    }
    public String getVoting() {
        return voting;
    }
    public void setVoting(String voting) {
        this.voting = voting;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getInvitations() {
        return invitations;
    }
    public void setInvitations(String invitations) {
        this.invitations = invitations;
    }
    public Boolean getSelfJoin() {
        return selfJoin;
    }
    public void setSelfJoin(Boolean selfJoin) {
        this.selfJoin = selfJoin;
    }
    public Boolean getCardCovers() {
        return cardCovers;
    }
    public void setCardCovers(Boolean cardCovers) {
        this.cardCovers = cardCovers;
    }
    public Boolean getCardCounts() {
        return cardCounts;
    }
    public void setCardCounts(Boolean cardCounts) {
        this.cardCounts = cardCounts;
    }
    public Boolean getIsTemplate() {
        return isTemplate;
    }
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }
    public String getCardAging() {
        return cardAging;
    }
    public void setCardAging(String cardAging) {
        this.cardAging = cardAging;
    }
    public Boolean getCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }
    public void setCalendarFeedEnabled(Boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
    }
    public List<Object> getHiddenPluginBoardButtons() {
        return hiddenPluginBoardButtons;
    }
    public void setHiddenPluginBoardButtons(List<Object> hiddenPluginBoardButtons) {
        this.hiddenPluginBoardButtons = hiddenPluginBoardButtons;
    }
    public List<SwitcherView> getSwitcherViews() {
        return switcherViews;
    }
    public void setSwitcherViews(List<SwitcherView> switcherViews) {
        this.switcherViews = switcherViews;
    }
    public String getBackground() {
        return background;
    }
    public void setBackground(String background) {
        this.background = background;
    }
    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Object getBackgroundImage() {
        return backgroundImage;
    }
    public void setBackgroundImage(Object backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
    public Boolean getBackgroundTile() {
        return backgroundTile;
    }
    public void setBackgroundTile(Boolean backgroundTile) {
        this.backgroundTile = backgroundTile;
    }
    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }
    public void setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
    }
    public Object getBackgroundImageScaled() {
        return backgroundImageScaled;
    }
    public void setBackgroundImageScaled(Object backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
    }
    public String getBackgroundBottomColor() {
        return backgroundBottomColor;
    }
    public void setBackgroundBottomColor(String backgroundBottomColor) {
        this.backgroundBottomColor = backgroundBottomColor;
    }
    public String getBackgroundTopColor() {
        return backgroundTopColor;
    }
    public void setBackgroundTopColor(String backgroundTopColor) {
        this.backgroundTopColor = backgroundTopColor;
    }
    public Boolean getCanBePublic() {
        return canBePublic;
    }
    public void setCanBePublic(Boolean canBePublic) {
        this.canBePublic = canBePublic;
    }
    public Boolean getCanBeEnterprise() {
        return canBeEnterprise;
    }
    public void setCanBeEnterprise(Boolean canBeEnterprise) {
        this.canBeEnterprise = canBeEnterprise;
    }
    public Boolean getCanBeOrg() {
        return canBeOrg;
    }
    public void setCanBeOrg(Boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
    }
    public Boolean getCanBePrivate() {
        return canBePrivate;
    }
    public void setCanBePrivate(Boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
    }
    public Boolean getCanInvite() {
        return canInvite;
    }
    public void setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
    }
}
