class Solution {
    public String destCity(List<List<String>> paths) {

        List<String> fromCities = new ArrayList<>();
        List<String> toCities = new ArrayList<>();

        for (int i = 0; i < paths.size(); i++) {
            fromCities.add(paths.get(i).get(0));
            toCities.add(paths.get(i).get(1));
        }

        for (int i = 0; i < toCities.size(); i++) {
            String city = toCities.get(i);
            if (!fromCities.contains(city)) {
                return city;
            }
        }

        return "";
    }
}
