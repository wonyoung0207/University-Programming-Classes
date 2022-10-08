using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BookInfoWindowApp
{
    public partial class MainForm : Form
    {
        Book b = null;
        EBook eb = null;

        public MainForm()
        {
            InitializeComponent();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string title, author, ISBN, publisher;
            int page, price;

            title = txtTitle.Text;
            author = txtAuthor.Text;
            ISBN = txtISBN.Text;
            publisher = txtPublisher.Text;
            page = int.Parse(txtPage.Text);
            price = Convert.ToInt32(txtPrice.Text);
            

            eb = new EBook(title, author, page, ISBN, publisher, price);//생성자 호출 

        }

        private void btnSale_Click(object sender, EventArgs e)
        {
            int discount;
            discount = int.Parse(txtDiscount.Text);

            eb.DiscountPrice(discount);


        }

        private void btnOfs_Click(object sender, EventArgs e)//품절을 토클 
        {
            /*Boolean outOfStock;*/

            if (eb.OutOfStock == false)
            {
                eb.StockOut();
            }
            else
            {
                eb.StorageInWareHouse();
            }
            /*(eb.outOfStock == false) ? eb.StockOut() : eb.StorageInWareHouse();*/

        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            txtResult.Text = eb.ToStirng();
        }
    }
}
