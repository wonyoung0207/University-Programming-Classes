using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookInfoWindowApp
{
    class Book
    {
        private string title;//책 제목
        private string author;//책 저자
        private string ISBN;//국제표준도서번호
        private string publisher;//출판사 
        private int page;//쪽수

        public Book(string title,string author, int page, string ISBN,string publisher)//생성자
        {
            this.title = title;
            this.author = author;
            this.page = page;
            this.ISBN = ISBN;
            this.publisher = publisher;

        }

        public int Page//page에 대한 프로퍼티 -> () 없음
        {
            get
            {
                return page;
            }
            set
            {
                //value 를 해주는 이유는 b.Page = value; -> 이 형태로 했을때 set 프로퍼티가 불리기 때문에
                this.page = value;
            }
        }

        public string ToString()
        {
            return "Title : " + title + ", author : " + author + ", page : " 
                + page + ", ISBN : " + ISBN + ", publisher : " + publisher;
        }
    }
}
