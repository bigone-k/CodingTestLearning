package bigone.programmers.hash;

import bigone.Solution;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        for( int i = 0; i < phone_book.length; i++)
            for( int j = 0; j < phone_book.length; j++)
                if (i!=j && phone_book[i].startsWith(phone_book[j]))
                    return false;

        return true;
    }
}
