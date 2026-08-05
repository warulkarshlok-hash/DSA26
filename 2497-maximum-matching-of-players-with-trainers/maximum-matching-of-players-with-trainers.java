class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;

        for (int j = 0; j < trainers.length && i < players.length; j++) {
            if (trainers[j] >= players[i]) {
            i++;
        }
    }

    return i;
    }
}