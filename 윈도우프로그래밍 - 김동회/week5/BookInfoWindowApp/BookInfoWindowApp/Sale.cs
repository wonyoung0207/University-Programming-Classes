using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookInfoWindowApp
{
    interface Sale
    {
        void DiscountPrice(int discount);//가격을 조정
        void StockOut();//품절 여부를 변경(재고 없음)
        void StorageInWareHouse();//품절여부 변경(재고 있음)

    }
}
