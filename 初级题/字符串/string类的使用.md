Member functions

Both string::size and string::length are synonyms and return the same value.

    string str ("Test string");  //initial

    cin>>str;  //input to string

    cout<<str; //output string

    getline(cin,str); //getline into string

    str.size();  //get size of string

    str.clear(); //clear string

    str.empty(); //test the string is empty

    str[i]; //get the element of string in pos i

    str.at(i);  //get the element of string in pos i

    str.substr (3,5); //get the substr of string from pos 3 to 5

    str.find("live");  //find the live in str,return the start position

    str.data(); //不保证以null结尾

    str.c_str(); //保证以null结尾

    str.erase (10,8);  //删除字符

    str.append(str2);                  
    str.append(str3,6,3);    //追加字符串


    // used in the same order as described above:
    str.insert(6,str2);                 // to be (the )question
    str.insert(6,str3,3,4);             // to be (not )the question
    str.insert(10,"that is cool",8);    // to be not (that is )the question
    str.insert(10,"to be ");            // to be not (to be )that is the question
    str.insert(15,1,':');               // to be not to be(:) that is the question
    it = str.insert(str.begin()+5,','); // to be(,) not to be: that is the question
    str.insert (str.end(),3,'.');       // to be, not to be: that is the question(...)
    str.insert (it+2,str3.begin(),str3.begin()+3); // (or )    

    // replace signatures used in the same order as described above:

    // Using positions:                 0123456789*123456789*12345
    std::string str=base;           // "this is a test string."
    str.replace(9,5,str2);          // "this is an example string." (1)
    str.replace(19,6,str3,7,6);     // "this is an example phrase." (2)
    str.replace(8,10,"just a");     // "this is just a phrase."     (3)
    str.replace(8,6,"a shorty",7);  // "this is a short phrase."    (4)
    str.replace(22,1,3,'!');        // "this is a short phrase!!!"  (5)    

    // swap strings
    std::string buyer ("money");
    std::string seller ("goods");

    std::cout << "Before the swap, buyer has " << buyer;
    std::cout << " and seller has " << seller << '\n';

    seller.swap (buyer);

    std::cout << " After the swap, buyer has " << buyer;
    std::cout << " and seller has " << seller << '\n';


    // string::pop_back
    #include <iostream>
    #include <string>

    int main ()
    {
      std::string str ("hello world!");
      str.pop_back();
      std::cout << str << '\n';
      return 0;
    }

    // string::push_back
    #include <iostream>
    #include <fstream>
    #include <string>

    int main ()
    {
      std::string str;
      std::ifstream file ("test.txt",std::ios::in);
      if (file) {
        while (!file.eof()) str.push_back(file.get());
      }
      std::cout << str << '\n';
      return 0;
    }




// extract to string
#include <iostream>
#include <string>
//getline(cin,name)

int main ()
{
  std::string name;

  std::cout << "Please, enter your full name: ";
  std::getline (std::cin,name);
  std::cout << "Hello, " << name << "!\n";

  return 0;
}


// extract to string
#include <iostream>
#include <string>

main ()
{
  std::string name;

  std::cout << "Please, enter your name: ";
  std::cin >> name;
  std::cout << "Hello, " << name << "!\n";

  return 0;
}



// inserting strings into output streams
#include <iostream>
#include <string>

main ()
{
  std::string str = "Hello world!";
  std::cout << str << '\n';
  return 0;
}