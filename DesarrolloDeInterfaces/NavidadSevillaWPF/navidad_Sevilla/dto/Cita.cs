using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Reflection.Metadata;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace navidadSevilla.dto
{
    public class Cita: INotifyPropertyChanged, IDataErrorInfo
    {
        public String Nombre { get; set; }
        public String Apellidos { get; set; }
        public String Grupo { get; set; }
        public DateTime Fecha { get; set; }
        public String Turno { get; set; }
        public String Espacio { get; set; }

        public String Actividad { get; set; }

        string IDataErrorInfo.Error
        {
            get
            {
                return  ""          ;
            }
        }

        public string this[string columnName]
        {
            get
            {
                string result = "";
                if(columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(Nombre))
                    {
                        result = "Introduzca su Nombre";
                    }
                }
                if (columnName == "Apellidos")
                {
                    if (string.IsNullOrEmpty(Apellidos))
                    {
                        result = "Introduzca sus apellidos";
                    }
                }
                if (columnName == "Grupo")
                {
                    if (string.IsNullOrEmpty(Grupo))
                    {
                        result = "Seleccione si la reserva corresponde a un Grupo";
                    }
                }
                if (columnName == "Turno")
                {
                    if (string.IsNullOrEmpty(Turno))
                    {
                        result = "Introduzca el turno en el que desea realizar la visita";
                    }
                }
                if (columnName == "Espacio")
                {
                    if (string.IsNullOrEmpty(Espacio))
                    {
                        result = "Introduzca el espacio que desea visitar";
                    }
                }
                if (columnName == "Actividad")
                {
                    if (string.IsNullOrEmpty(Actividad))
                    {
                        result = "Introduzca la Actividad que desea reservar";
                    }
                }
                return result;
            }
        }

        public Cita() {
            //Grupo = "Si";
            Fecha = DateTime.Now;
            
        }

        public Cita(string nombre, string apellidos, string grupo, DateTime fecha, string turno, string espacio, string actividad)
        {
            this.Nombre = nombre;
            this.Apellidos = apellidos;
            this.Grupo = grupo;
            this.Fecha = fecha;
            this.Turno = turno;
            this.Espacio = espacio;
            this.Actividad = actividad;
            
        }

       

        
        public event PropertyChangedEventHandler PropertyChanged;
    }
}
