using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookInfoWindowApp
{
    class EBook : Book,Sale
    {
        private int price;//가격
        private Boolean outOfStock = false;//품절 유무\

/*        private string title;//책 제목
        private string author;//책 저자
        private string ISBN;//국제표준도서번호
        private string publisher;//출판사 
        private int page;//쪽수
*/

        public EBook(string title, string author, int page, string ISBN, string publisher,int price) : base(title, author, page, ISBN, publisher)
        {//하위클래스 생성자 호출시 상위클래스 생성자 먼저 호출한다. 
            
            this.price = price;

        }

        public int Price//price 맴버변수에 대한 프로퍼티 생성
        {
            get
            {
                return price;
            }
            set
            {
                this.price = value;
            }

        }

        public Boolean OutOfStock//price 맴버변수에 대한 프로퍼티 생성
        {
            get
            {
                return outOfStock;
            }
            set
            {
                this.outOfStock = value;
            }

        }

        public string ToStirng()
        {
            return base.ToString() + ", price : " + price + ", outOfStock : " + outOfStock;
        }

        public void DiscountPrice(int discount)//가격을 조정
        {
            this.price = this.price - discount;
        }

        public void StockOut()//품절 여부를 변경(재고 없음)
        {
            this.outOfStock = true;
        }

        public void StorageInWareHouse()//품절여부 변경(재고 있음)
        {
            this.outOfStock = false;
        }



    }
}
