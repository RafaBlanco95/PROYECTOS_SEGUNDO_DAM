using navidadSevilla.dto;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace navidadSevilla
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class Citas : Window
    {

        public static Logica logica = logica = new Logica();
        
        public Citas()
        {
            InitializeComponent();
            datagrid.DataContext = logica;
        }

        private void editarCita(object sender, RoutedEventArgs e)
        {
            if(datagrid.SelectedIndex != -1)
            {
                new Formulario_Citas(datagrid.SelectedIndex).Show();
            }
        }

       private void eliminarCita(object sender, RoutedEventArgs e)
        {
            if(datagrid.SelectedIndex != -1)
            {
                logica.eliminarCita(datagrid.SelectedIndex);
            }
        }

        private void nuevaCita(object sender, RoutedEventArgs e)
        {
            new Formulario_Citas().Show();
        }

        private void datagrid_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        public void goBack(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
