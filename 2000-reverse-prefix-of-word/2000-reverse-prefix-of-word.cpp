class Solution {
public:
    string reversePrefix(string word, char ch) {
        stack<char> s;

        int idx = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word[i] == ch) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            return word;
        }

        for (int i = 0; i <= idx; i++) {
            s.push(word[i]);
        }

        for (int i = 0; i <= idx; i++) {
            word[i] = s.top();
            s.pop();
        }
        
        return word;
    }
};
