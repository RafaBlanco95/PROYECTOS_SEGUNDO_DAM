   M S B A M L   `   `   `  ����J  Fnavidad_Sevilla, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null/clr-namespace:navidadSevillanavidadSevilla  5      %    navidadSevilla.Formulario_Citas   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5      R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      .localclr-namespace:navidadSevilla     5        � Title$  Formulario de la Cita��5	      $	��500��5
   	   $	��650��6    � 	Resources 5       �� 
TargetType �� Triggers P� Property P� Value �� Property �� Value �� RelativeSource	 �� Path(  "System.Windows.Controls.DatePicker��%�  '��       '�� �     '  �    �� 5   
   " ��6    5      P� 5       �@=�HasError$
 True��69   . �5      ��  �@�ToolTip 60   ��  �� *Self+$)	 #(Validation.Errors)[0].ErrorContent�5      5      �� 5   
   " ��6    5      P� 5       �@=�HasError$
 True��69   . �5      ��  �@�ToolTip 60   ��  �� *Self+$)	 #(Validation.Errors)[0].ErrorContent�5      5      �� 5   
   "  6    5      P� 5       �@=�HasError$
 True��69   . �5      ��  �@�ToolTip 60   ��  �� *Self+$)	 #(Validation.Errors)[0].ErrorContent�5      5       5!      .��5%      � $��	0,0,10,-6q�6   .+�5&   
   �� $��img\navidad.png��6   $��UniformToFill=�6)   $	��Top=�6A   $
��Left=�6Y   $	��525��6t   $	��744��6�   $��	0,-32,0,0q�6�   �� 5'   
   $��145,137,387,301q�6   $
��Bold"�6-   $��15(�6?   Nombre6V   �� 5(   
   $��145,179,381,260q�6   $
��Bold"�6-   $��15(�6?   	Apellidos6Y   �� 5)   
   $��145,225,407,224q�6   $
��Bold"�6.   $��15(�6@   Grupo6V   �� 5*   
   $��145,266,412,172q�6   $
��Bold"�6.   $��15(�6@   Fecha6V   �� 5+   
   $��145,306,412,140q�6   $
��Bold"�6.   $��15(�6@   Turno6V   �� 5,   
   $��145,350,407,90q�6   $
��Bold"�6-   $��15(�6?   	Espacio6W   �� 5-   
   $��145,397,407,43q�6   $
��Bold"�6-   $��15(�6?   	Actividad6Y   �� 5/   
   -   5        
 ��Name$
 	boxNombre��5/      $
��Left=�6%   $��23��6@   $��237,137,0,0q�6L    �� TextWrapping$
 Wrap=�6a   $	��Top=�6u   $	��180��6�   ��6�   �� $	 Nombre� �� NotifyOnValidationError$
 True�� �� ValidatesOnDataErrors$
 True���� 50   
   -   5        $
 boxApellidos��50      $
��Left=�6(   $��23��6C   $��237,178,0,0q�6O   $
 Wrap=�6d   $	��Top=�6x   $	��180��6�   ��6�   �� $	 	Apellidos�$
 True��$
 True���� 51   
   -   5         ��Name$ 
comboGrupo��51      $
��Left=�6'   $��238,220,0,0q�6B   $	��Top=�6W   $	��179��6o    �� Text 6�   �� $	 Grupo�$
 True��$
 True��.@�52      �� $��Si��6   �� 53      $��No��6   54        55   
   -   5          Name$ pickerFecha��55      $
��Left=�6*   $��23��6E   $��238,264,0,0q�6Q   $	��Top=�6f   $	��179��6~      SelectedDate 6�   �� $	 Fecha��� 56   
   -   5        $ comboEspacio��56      $
��Left=�6)   $��238,349,0,0q�6D   $	��Top=�6Y   $	��179��6q    6�   �� $	 Espacio�$
 True��$
 True��.@�57      �� $��Bosque Encantado��6   �� 58      $��Sevillalandia��6   59      �� 5:   
   -   5        $ 
comboTurno��5:      $
��Left=�6'   $��238,306,0,0q�6B   $	��Top=�6W   $	��179��6o    6�   �� $	 Turno�$
 True��$
 True��.@�5;      �� $��Mañana��6   �� 5<      $��Tarde��6   5>      �� 5?   
   -   5        $ comboActividad��5?      $
��Left=�6+   $��238,397,0,0q�6F   $	��Top=�6[   $	��179��6s    6�   �� $	 	Actividad�$
 True��$
 True��.@�5@      �� $��1��6   �� 5A      $��2��6   �� 5B      $��3��6   �� 5C      $��4��6   5D      �� 5E   
   -   5         ��Name$ Aceptar��5E      $��Aceptar��6"   $��15(�64   $
��Bold"�6B   $��454,145,86,278q�6T   
������ $��0q�6�   �� 5F   
   -	   5        $ Cancelar��5F      $��	Cancelar ��6#   $��15(�67   $
��Bold"�6E   $��454,283,76,141q�6W   
������ $��0q�6�   �� 5G   
   -
   5         ��Name$ giralda2��5G      $��\img\giralda.png��6#   $	��Top=�6=   $
��Left=�6U   $��62��6p   $��71��6|   $��523,397,0,0q�6�   �� 5H   
   -   5        $
 tick��5H      $��\img\aceptar.png��6   $	��Top=�69   $
��Left=�6Q   $��56��6l   $��48��6x   $��530,139,0,0q�6�   �� 5I   
   -   5        $��15(�5I      $
��Bold"�6   $
��Left=�61   $��534,276,0,0q�6L   $	��Top=�6a   $��54��6y   $��66��6�   
������ $��0q�6�   .��5J      �� -   5        $ crossbutton��5J      $��\img\cancelar.png��6*   $��52��6F   $��56��6R   5K      5L      5M      