import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> allCardsSet = allCards(collections);
        for (Set<String> set : collections) {
            allCardsSet.retainAll(set);
        }
        return allCardsSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardsSet = new HashSet<>();
        for (Set<String> set : collections) {
            allCardsSet.addAll(set);
        }
        return allCardsSet;
    }

}
