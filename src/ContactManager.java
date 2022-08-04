public class ContactManager {
    Contact[] myFriends;
    int friendCount;

    public ContactManager() {
        this.friendCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendCount] = contact;
        friendCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
