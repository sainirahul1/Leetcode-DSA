class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        // Step 1: business line order
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        // Step 2: store valid coupons
        List<String[]> valid = new ArrayList<>();

        // Step 3: check each coupon
        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) {
                continue;
            }

            if (code[i] == null || code[i].length() == 0) {
                continue;
            }

            if (!order.containsKey(businessLine[i])) {
                continue;
            }

            if (!code[i].matches("[A-Za-z0-9_]+")) {
                continue;
            }

            valid.add(new String[]{businessLine[i], code[i]});
        }

        // Step 4: sort
        Collections.sort(valid, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {

                if (!order.get(a[0]).equals(order.get(b[0]))) {
                    return order.get(a[0]) - order.get(b[0]);
                }

                return a[1].compareTo(b[1]);
            }
        });

        // Step 5: take only codes
        List<String> answer = new ArrayList<>();
        for (String[] c : valid) {
            answer.add(c[1]);
        }

        return answer;
    }
}
