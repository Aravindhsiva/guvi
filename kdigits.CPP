#include <iostream>
#include <string>

class solution {
  public:
    int removeKdigits(const std::string & num, int k) {
        if (k == 1) {
            return std::stoi(removeOneDigit(num));
        }
        else if (k > 1){
            return removeKdigits(removeOneDigit(num), k-1);
        }
    }

  private:
    std::string removeOneDigit(const std::string & num) {
        if (num[0] > num[1]) {
            size_t begin = 1;
            while (begin < num.size() && num[begin] == '0')
                begin++;
            if (begin == num.size())
                return "0";
            else
                return num.substr(begin);
        }
        else {
            size_t begin = 1;
            while (begin < num.size() && num[begin] >= num[begin-1])
                begin++;
            auto cpy = num;
            cpy.erase(cpy.begin()+begin-1);
            return cpy;
        }
    }
};

int main() {
    // std::string num{"1432219"};
    // int k = 3;

    // std::string num{"10200"};
    // int k = 1;

    std::string num{"10"};
    int k = 2;

    solution soln;
    int result = soln.removeKdigits(num, k);
    std::cout << "The largest number after removing k digits is:\n"
              << result << std::endl;
}
/*Hard work never fails*/
