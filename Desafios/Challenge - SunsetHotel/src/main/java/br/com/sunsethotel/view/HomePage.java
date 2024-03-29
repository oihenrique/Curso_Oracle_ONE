package br.com.sunsethotel.view;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;
import br.com.sunsethotel.dao.ReservationDao;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.dao.UserDao;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;
import br.com.sunsethotel.model.User;
import br.com.sunsethotel.view.admin.EditUserWindow;
import br.com.sunsethotel.view.admin.NewUserWindow;
import br.com.sunsethotel.view.guests.NewGuestWindow;
import br.com.sunsethotel.view.guests.UpdateGuestInfo;
import br.com.sunsethotel.view.reservations.EditReservationWindow;
import br.com.sunsethotel.view.reservations.NewReservationWindow;
import br.com.sunsethotel.view.rooms.NewRoomWindow;
import br.com.sunsethotel.view.rooms.EditRoomWindow;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.persistence.EntityManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * @author Henrique
 */
public class HomePage extends javax.swing.JFrame {
    private final EntityManager dbConnection;
    private final GuestDao guestDao;
    private final ReservationDao reservationDao;
    private final RoomDao roomDao;
    private final UserDao userDao;

    /**
     * Creates new form homePage
     */
    public HomePage() {
        this.dbConnection = JPAUtil.getEntityManager();
        this.guestDao = new GuestDao(dbConnection);
        this.reservationDao = new ReservationDao(dbConnection);
        this.roomDao = new RoomDao(dbConnection);
        this.userDao = new UserDao(dbConnection);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePagePanel = new javax.swing.JPanel();
        jbGuests = new javax.swing.JButton();
        jbRooms = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbReservations = new javax.swing.JButton();
        jbAdmin = new javax.swing.JButton();
        jLogo = new javax.swing.JLabel();
        backgroundArea = new javax.swing.JPanel();
        homePageWelcome = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlTodayDate = new javax.swing.JLabel();
        jlWelcomeTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        guestsArea = new javax.swing.JPanel();
        guestTableScroll = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        newGuestButton = new javax.swing.JButton();
        editGuestButton = new javax.swing.JButton();
        deleteGuestButton = new javax.swing.JButton();
        guestTitleLabel = new javax.swing.JLabel();
        jtfSearchGuest = new javax.swing.JTextField();
        jbSearchGuest = new javax.swing.JButton();
        searchGuestLabel = new javax.swing.JLabel();
        reservationArea = new javax.swing.JPanel();
        reservationTableScroll = new javax.swing.JScrollPane();
        reservationsTable = new javax.swing.JTable();
        addReservationButton = new javax.swing.JButton();
        editReservationButton = new javax.swing.JButton();
        deleteReservationButton = new javax.swing.JButton();
        reservationTitleLabel = new javax.swing.JLabel();
        jtfSearchReservation = new javax.swing.JTextField();
        jbSearchReservation = new javax.swing.JButton();
        searchReservationLabel = new javax.swing.JLabel();
        roomsArea = new javax.swing.JPanel();
        roomTableScroll = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        addRoomButton = new javax.swing.JButton();
        editRoomButton = new javax.swing.JButton();
        deleteRoomButton = new javax.swing.JButton();
        roomsTitleLabel = new javax.swing.JLabel();
        jtfSearchRooms = new javax.swing.JTextField();
        jbSearchRooms = new javax.swing.JButton();
        searchRoomsLabel = new javax.swing.JLabel();
        adminArea = new javax.swing.JPanel();
        adminTableScroll = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        userTitleLabel = new javax.swing.JLabel();
        jtfUserReservation = new javax.swing.JTextField();
        jbUserReservation = new javax.swing.JButton();
        searchUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sunset Hotel");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setName("homePage"); // NOI18N
        setSize(new java.awt.Dimension(900, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        homePagePanel.setBackground(new java.awt.Color(253, 253, 253));
        homePagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homePagePanel.setMinimumSize(new java.awt.Dimension(250, 270));
        homePagePanel.setPreferredSize(new java.awt.Dimension(250, 720));

        jbGuests.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbGuests.setForeground(new java.awt.Color(32, 32, 32));
        jbGuests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/person.png"))); // NOI18N
        jbGuests.setText("Guests");
        jbGuests.setBorderPainted(false);
        jbGuests.setContentAreaFilled(false);
        jbGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuests.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbGuests.addActionListener(this::jbGuestsActionPerformed);

        jbRooms.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbRooms.setForeground(new java.awt.Color(32, 32, 32));
        jbRooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searching-magnifying-glass.png"))); // NOI18N
        jbRooms.setText("Rooms");
        jbRooms.setBorderPainted(false);
        jbRooms.setContentAreaFilled(false);
        jbRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRooms.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbRooms.addActionListener(this::jbRoomsActionPerformed);

        jbReservations.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbReservations.setForeground(new java.awt.Color(32, 32, 32));
        jbReservations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jbReservations.setText("Reservations");
        jbReservations.setBorderPainted(false);
        jbReservations.setContentAreaFilled(false);
        jbReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbReservations.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbReservations.addActionListener(this::jbReservationsActionPerformed);

        jbAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAdmin.setForeground(new java.awt.Color(32, 32, 32));
        jbAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin-tools.png"))); // NOI18N
        jbAdmin.setText("Administration");
        jbAdmin.setBorderPainted(false);
        jbAdmin.setContentAreaFilled(false);
        jbAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbAdmin.addActionListener(this::jbAdminActionPerformed);

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-180px.png"))); // NOI18N

        javax.swing.GroupLayout homePagePanelLayout = new javax.swing.GroupLayout(homePagePanel);
        homePagePanel.setLayout(homePagePanelLayout);
        homePagePanelLayout.setHorizontalGroup(
                homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(homePagePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbReservations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbRooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbGuests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(homePagePanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLogo)
                                .addGap(40, 40, 40))
        );
        homePagePanelLayout.setVerticalGroup(
                homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePagePanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLogo)
                                .addGap(40, 40, 40)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbGuests)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbReservations)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbRooms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAdmin)
                                .addContainerGap())
        );

        backgroundArea.setMinimumSize(new java.awt.Dimension(630, 720));
        backgroundArea.setPreferredSize(new java.awt.Dimension(630, 720));
        backgroundArea.setLayout(new java.awt.CardLayout());

        homePageWelcome.setBackground(new java.awt.Color(246, 246, 246));
        homePageWelcome.setMinimumSize(new java.awt.Dimension(630, 720));
        homePageWelcome.setPreferredSize(new java.awt.Dimension(630, 720));

        jlTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitle.setText("Sunset Hotel reservation system");

        jlTodayDate.setText("Today is 03/09/2023");

        jlWelcomeTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlWelcomeTitle.setText("Welcome!");

        jLabel4.setText("Hotel booking system. Efficiently and easily control and manage the flow of hotel reservations and guests.");

        jLabel5.setText("This system will allow you to maintain complete and detailed control of your reservations and guests.");

        jLabel6.setText("You will have access to special tools for specific tasks, such as:");

        jLabel7.setText("- Guest and reservation registration ");

        jLabel8.setText("- Editing of existing guests and reservations");

        jLabel9.setText("- Deletion of all types of records");

        javax.swing.GroupLayout homePageWelcomeLayout = new javax.swing.GroupLayout(homePageWelcome);
        homePageWelcome.setLayout(homePageWelcomeLayout);
        homePageWelcomeLayout.setHorizontalGroup(
                homePageWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePageWelcomeLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(homePageWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jlWelcomeTitle)
                                        .addComponent(jlTitle)
                                        .addComponent(jlTodayDate))
                                .addGap(37, 37, 37))
        );
        homePageWelcomeLayout.setVerticalGroup(
                homePageWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePageWelcomeLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jlTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlTodayDate)
                                .addGap(82, 82, 82)
                                .addComponent(jlWelcomeTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundArea.add(homePageWelcome, "welcomeArea");

        guestsArea.setBackground(new java.awt.Color(246, 246, 246));
        guestsArea.setMinimumSize(new java.awt.Dimension(630, 720));
        guestsArea.setPreferredSize(new java.awt.Dimension(630, 720));

        guestTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Name", "Nationality", "CPF", "Phone Number", "Birth date"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        guestTableScroll.setViewportView(guestTable);

        newGuestButton.setText("New");
        newGuestButton.addActionListener(this::newGuestButtonActionPerformed);

        editGuestButton.setText("Edit");
        editGuestButton.addActionListener(this::editGuestButtonActionPerformed);

        deleteGuestButton.setText("Delete");
        deleteGuestButton.addActionListener(this::deleteGuestButtonActionPerformed);

        guestTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        guestTitleLabel.setText("Guests area");

        jbSearchGuest.setText("search");

        searchGuestLabel.setText("search:");

        javax.swing.GroupLayout guestsAreaLayout = new javax.swing.GroupLayout(guestsArea);
        guestsArea.setLayout(guestsAreaLayout);
        guestsAreaLayout.setHorizontalGroup(
                guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                .addGroup(guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(guestTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                                .addGroup(guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                                                .addGap(141, 141, 141)
                                                                .addComponent(jtfSearchGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                                                .addGap(98, 98, 98)
                                                                .addComponent(searchGuestLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(newGuestButton)
                                                                .addGap(89, 89, 89)
                                                                .addComponent(editGuestButton)))
                                                .addGap(18, 18, 18)
                                                .addGroup(guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jbSearchGuest)
                                                        .addComponent(deleteGuestButton)))
                                        .addGroup(guestsAreaLayout.createSequentialGroup()
                                                .addGap(249, 249, 249)
                                                .addComponent(guestTitleLabel)))
                                .addGap(2, 2, 2))
        );

        guestsAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{deleteGuestButton, editGuestButton, newGuestButton});

        guestsAreaLayout.setVerticalGroup(
                guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestsAreaLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(guestTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(newGuestButton)
                                        .addComponent(editGuestButton)
                                        .addComponent(deleteGuestButton))
                                .addGap(27, 27, 27)
                                .addGroup(guestsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfSearchGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbSearchGuest)
                                        .addComponent(searchGuestLabel))
                                .addGap(41, 41, 41)
                                .addComponent(guestTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
        );

        backgroundArea.add(guestsArea, "guestArea");

        reservationArea.setBackground(new java.awt.Color(246, 246, 246));
        reservationArea.setMinimumSize(new java.awt.Dimension(630, 720));

        reservationsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Name", "Room", "Reservation date", "Expiration date", "Value", "Payment method"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        reservationTableScroll.setViewportView(reservationsTable);

        addReservationButton.setText("New");
        addReservationButton.addActionListener(this::addReservationButtonActionPerformed);

        editReservationButton.setText("Edit");
        editReservationButton.addActionListener(this::editReservationButtonActionPerformed);

        deleteReservationButton.setText("Delete");
        deleteReservationButton.addActionListener(this::deleteReservationButtonActionPerformed);

        reservationTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reservationTitleLabel.setText("Reservations");

        jbSearchReservation.setText("search");

        searchReservationLabel.setText("search:");

        javax.swing.GroupLayout reservationAreaLayout = new javax.swing.GroupLayout(reservationArea);
        reservationArea.setLayout(reservationAreaLayout);
        reservationAreaLayout.setHorizontalGroup(
                reservationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reservationAreaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchReservationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(reservationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(reservationAreaLayout.createSequentialGroup()
                                                .addComponent(addReservationButton)
                                                .addGap(89, 89, 89)
                                                .addComponent(editReservationButton)
                                                .addGap(100, 100, 100)
                                                .addComponent(deleteReservationButton))
                                        .addGroup(reservationAreaLayout.createSequentialGroup()
                                                .addComponent(jtfSearchReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbSearchReservation)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(reservationAreaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reservationTitleLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationAreaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reservationTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reservationAreaLayout.setVerticalGroup(
                reservationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationAreaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(reservationTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(reservationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(addReservationButton)
                                        .addComponent(editReservationButton)
                                        .addComponent(deleteReservationButton))
                                .addGap(27, 27, 27)
                                .addGroup(reservationAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfSearchReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbSearchReservation)
                                        .addComponent(searchReservationLabel))
                                .addGap(41, 41, 41)
                                .addComponent(reservationTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(62, Short.MAX_VALUE))
        );

        backgroundArea.add(reservationArea, "guestArea");

        roomsArea.setBackground(new java.awt.Color(246, 246, 246));
        roomsArea.setMinimumSize(new java.awt.Dimension(630, 720));

        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Room number", "Room type", "Availability"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        roomTableScroll.setViewportView(roomsTable);

        addRoomButton.setText("New");
        addRoomButton.addActionListener(this::addRoomButtonActionPerformed);

        editRoomButton.setText("Edit");
        editRoomButton.addActionListener(this::editRoomButtonActionPerformed);

        deleteRoomButton.setText("Delete");
        deleteRoomButton.addActionListener(this::deleteRoomButtonActionPerformed);

        roomsTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        roomsTitleLabel.setText("Rooms");

        jbSearchRooms.setText("search");

        searchRoomsLabel.setText("search:");

        javax.swing.GroupLayout roomsAreaLayout = new javax.swing.GroupLayout(roomsArea);
        roomsArea.setLayout(roomsAreaLayout);
        roomsAreaLayout.setHorizontalGroup(
                roomsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roomsAreaLayout.createSequentialGroup()
                                .addGroup(roomsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roomsAreaLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(roomTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(roomsAreaLayout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(searchRoomsLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addRoomButton)
                                                .addGap(89, 89, 89)
                                                .addComponent(editRoomButton)
                                                .addGap(100, 100, 100)
                                                .addComponent(deleteRoomButton))
                                        .addGroup(roomsAreaLayout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(jtfSearchRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbSearchRooms))
                                        .addGroup(roomsAreaLayout.createSequentialGroup()
                                                .addGap(269, 269, 269)
                                                .addComponent(roomsTitleLabel)))
                                .addGap(16, 16, 16))
        );
        roomsAreaLayout.setVerticalGroup(
                roomsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomsAreaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(roomsTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(roomsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(addRoomButton)
                                        .addComponent(editRoomButton)
                                        .addComponent(deleteRoomButton))
                                .addGap(27, 27, 27)
                                .addGroup(roomsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfSearchRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbSearchRooms)
                                        .addComponent(searchRoomsLabel))
                                .addGap(41, 41, 41)
                                .addComponent(roomTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
        );

        backgroundArea.add(roomsArea, "guestArea");

        adminArea.setBackground(new java.awt.Color(246, 246, 246));
        adminArea.setMinimumSize(new java.awt.Dimension(630, 720));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Acess Code", "Name", "E-mail", "CPF", "Birth date", "Administrator"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        adminTableScroll.setViewportView(usersTable);

        addUserButton.setText("New");
        addUserButton.addActionListener(this::addUserButtonActionPerformed);

        editUserButton.setText("Edit");
        editUserButton.addActionListener(this::editUserButtonActionPerformed);

        deleteUserButton.setText("Delete");
        deleteUserButton.addActionListener(this::deleteUserButtonActionPerformed);

        userTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userTitleLabel.setText("Users");

        jbUserReservation.setText("search");

        searchUserLabel.setText("search:");

        javax.swing.GroupLayout adminAreaLayout = new javax.swing.GroupLayout(adminArea);
        adminArea.setLayout(adminAreaLayout);
        adminAreaLayout.setHorizontalGroup(
                adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminAreaLayout.createSequentialGroup()
                                .addGroup(adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminAreaLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(adminTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAreaLayout.createSequentialGroup()
                                                        .addGap(98, 98, 98)
                                                        .addGroup(adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(userTitleLabel)
                                                                .addGroup(adminAreaLayout.createSequentialGroup()
                                                                        .addComponent(searchUserLabel)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(addUserButton)
                                                                        .addGap(89, 89, 89)
                                                                        .addComponent(editUserButton)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(deleteUserButton))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAreaLayout.createSequentialGroup()
                                                        .addGap(141, 141, 141)
                                                        .addComponent(jtfUserReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jbUserReservation))))
                                .addGap(16, 16, 16))
        );
        adminAreaLayout.setVerticalGroup(
                adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAreaLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(userTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(addUserButton)
                                        .addComponent(editUserButton)
                                        .addComponent(deleteUserButton))
                                .addGap(27, 27, 27)
                                .addGroup(adminAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfUserReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbUserReservation)
                                        .addComponent(searchUserLabel))
                                .addGap(41, 41, 41)
                                .addComponent(adminTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
        );

        backgroundArea.add(adminArea, "guestArea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(homePagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backgroundArea, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backgroundArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRoomsActionPerformed
        DefaultTableModel roomsTableModel = (DefaultTableModel) this.roomsTable.getModel();
        roomsTableModel.setRowCount(0);

        this.homePageWelcome.setVisible(false);
        enableRoomArea(true);

        List<Room> rooms = roomDao.listRooms();

        for (Room room : rooms) {
            Object[] rowData = {
                    room.getRoomNumber(),
                    room.getRoomType(),
                    room.isRoomAvailability()
            };
            roomsTableModel.addRow(rowData);
        }

        roomsTable.setModel(roomsTableModel);
    }//GEN-LAST:event_jbRoomsActionPerformed

    private void jbReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservationsActionPerformed
        DefaultTableModel reservationsTableModel = (DefaultTableModel) this.reservationsTable.getModel();
        reservationsTableModel.setRowCount(0);

        this.homePageWelcome.setVisible(false);
        enableReservationArea(true);

        List<Reservation> reservations = reservationDao.listAllReservations();

        for (Reservation reservation : reservations) {
            Object[] rowData = {
                    reservation.getGuestName(),
                    reservation.getRoomNumber(),
                    reservation.getReservationDate(),
                    reservation.getExpirationDate(),
                    reservation.getReservationValue(),
                    reservation.getPaymentMethod()};
            reservationsTableModel.addRow(rowData);
        }

        reservationsTable.setModel(reservationsTableModel);
    }//GEN-LAST:event_jbReservationsActionPerformed

    private void jbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdminActionPerformed
        DefaultTableModel usersTableModel = (DefaultTableModel) this.usersTable.getModel();
        usersTableModel.setRowCount(0);

        this.homePageWelcome.setVisible(false);
        enableAdminArea(true);

        List<User> users = userDao.listAllUsers();

        for (User user : users) {
            Object[] rowData = {
                    user.getAccessCode(),
                    user.getUserName(),
                    user.getEmail(),
                    user.getCpf(),
                    user.getBirthDate(),
                    user.isAdministrator()
            };
            usersTableModel.addRow(rowData);
        }

        usersTable.setModel(usersTableModel);
    }//GEN-LAST:event_jbAdminActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jbGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuestsActionPerformed
        DefaultTableModel guestTableModel = (DefaultTableModel) this.guestTable.getModel();
        guestTableModel.setRowCount(0);

        this.homePageWelcome.setVisible(false);
        enableGuestArea(true);
        List<Guest> guests = guestDao.listAllGuests();

        for (Guest guest : guests) {
            Object[] rowData = {guest.getGuestName(), guest.getNationality(), guest.getCpf(), guest.getPhoneNumber(), guest.getBirthDate()};
            guestTableModel.addRow(rowData);
        }

        guestTable.setModel(guestTableModel);
    }//GEN-LAST:event_jbGuestsActionPerformed

    private void newGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGuestButtonActionPerformed
        NewGuestWindow addGuestWindow = new NewGuestWindow();
        showPopupWindow(addGuestWindow, newGuestButton);
    }//GEN-LAST:event_newGuestButtonActionPerformed

    private void deleteGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGuestButtonActionPerformed
        DefaultTableModel guestTableModel = (DefaultTableModel) this.guestTable.getModel();

        if (this.guestTable.getSelectedRowCount() == 1) {
            String guestCPF = guestTableModel.getValueAt(this.guestTable.getSelectedRow(), 2).toString();

            Guest guest = guestDao.searchGuestByCpf(guestCPF);
            guestTableModel.removeRow(this.guestTable.getSelectedRow());
            guestDao.deleteGuest(guest);
            dbConnection.getTransaction().begin();
            dbConnection.getTransaction().commit();

            guestTableModel.removeRow(guestTable.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to delete.");
        }
    }//GEN-LAST:event_deleteGuestButtonActionPerformed

    private void editGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGuestButtonActionPerformed
        DefaultTableModel guestTableModel = (DefaultTableModel) this.guestTable.getModel();

        if (this.guestTable.getSelectedRowCount() == 1) {
            String guestCPF = guestTableModel.getValueAt(this.guestTable.getSelectedRow(), 2).toString();

            Guest guest = guestDao.searchGuestByCpf(guestCPF);

            UpdateGuestInfo editGuestWindow = new UpdateGuestInfo(guest);
            showPopupWindow(editGuestWindow, editGuestButton);
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to edit.");
        }
    }//GEN-LAST:event_editGuestButtonActionPerformed

    private void addReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservationButtonActionPerformed
        NewReservationWindow addReservationWindow = new NewReservationWindow();
        showPopupWindow(addReservationWindow, addReservationButton);
    }//GEN-LAST:event_addReservationButtonActionPerformed

    private void editReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editReservationButtonActionPerformed
        DefaultTableModel reservationTableModel = (DefaultTableModel) this.reservationsTable.getModel();

        if (this.reservationsTable.getSelectedRowCount() == 1) {
            Guest guest = guestDao.searchGuestByName(reservationTableModel.getValueAt(reservationsTable.getSelectedRow(), 0).toString());

            EditReservationWindow addReservationWindow = new EditReservationWindow(guest);
            showPopupWindow(addReservationWindow, editReservationButton);
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to edit.");
        }
    }//GEN-LAST:event_editReservationButtonActionPerformed

    private void deleteReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReservationButtonActionPerformed
        DefaultTableModel reservationTableModel = (DefaultTableModel) this.reservationsTable.getModel();

        if (this.reservationsTable.getSelectedRowCount() == 1) {
            Guest guest = guestDao.searchGuestByName(reservationTableModel.getValueAt(reservationsTable.getSelectedRow(), 0).toString());
            Reservation reservation = reservationDao.searchReservationsByGuest(guest).get(0);

            reservationDao.cancelReservation(reservation);

            dbConnection.getTransaction().begin();
            dbConnection.getTransaction().commit();

            reservationTableModel.removeRow(reservationsTable.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to delete.");
        }
    }//GEN-LAST:event_deleteReservationButtonActionPerformed

    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomButtonActionPerformed
        NewRoomWindow addRoomWindow = new NewRoomWindow();
        showPopupWindow(addRoomWindow, addRoomButton);
    }//GEN-LAST:event_addRoomButtonActionPerformed

    private void editRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRoomButtonActionPerformed
        DefaultTableModel roomTableModel = (DefaultTableModel) this.roomsTable.getModel();

        if (this.roomsTable.getSelectedRowCount() == 1) {
            String roomNumber = roomTableModel.getValueAt(roomsTable.getSelectedRow(), 0).toString();
            Room room = roomDao.searchByRoomNumber(Integer.valueOf(roomNumber));

            EditRoomWindow editNewRoomWindow = new EditRoomWindow(room);
            showPopupWindow(editNewRoomWindow, editRoomButton);
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to edit.");
        }
    }//GEN-LAST:event_editRoomButtonActionPerformed

    private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomButtonActionPerformed
        DefaultTableModel roomTableModel = (DefaultTableModel) this.roomsTable.getModel();

        if (this.roomsTable.getSelectedRowCount() == 1) {
            String roomNumber = roomTableModel.getValueAt(roomsTable.getSelectedRow(), 0).toString();
            Room room = roomDao.searchByRoomNumber(Integer.valueOf(roomNumber));

            roomDao.deleteRoom(room);
            dbConnection.getTransaction().begin();
            dbConnection.getTransaction().commit();

            roomTableModel.removeRow(roomsTable.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to delete.");
        }
    }//GEN-LAST:event_deleteRoomButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        NewUserWindow addUserWindow = new NewUserWindow();
        showPopupWindow(addUserWindow, addUserButton);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        DefaultTableModel userTableModel = (DefaultTableModel) this.usersTable.getModel();

        if (this.usersTable.getSelectedRowCount() == 1) {
            Integer accessCode = (Integer) userTableModel.getValueAt(usersTable.getSelectedRow(), 0);
            User user = userDao.searchByAcessCode(accessCode);

            EditUserWindow editUserWindow = new EditUserWindow(user);
            showPopupWindow(editUserWindow, editUserButton);
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to edit.");
        }
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        DefaultTableModel userTableModel = (DefaultTableModel) this.usersTable.getModel();

        if (this.usersTable.getSelectedRowCount() == 1) {
            Integer accessCode = (Integer) userTableModel.getValueAt(usersTable.getSelectedRow(), 0);
            User user = userDao.searchByAcessCode(accessCode);

            userDao.deleteUser(user);
            dbConnection.getTransaction().begin();
            dbConnection.getTransaction().commit();

            userTableModel.removeRow(usersTable.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Select one row to delete.");
        }
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    public void enableGuestArea(boolean enabled) {
        jbGuests.setEnabled(!enabled);
        this.guestsArea.setVisible(enabled);

        if (!jbReservations.isEnabled()) {
            jbReservations.setEnabled(true);
            enableReservationArea(!enabled);
        } else if (!jbAdmin.isEnabled()) {
            jbAdmin.setEnabled(true);
            enableAdminArea(!enabled);
        } else if (!jbRooms.isEnabled()) {
            jbRooms.setEnabled(true);
            enableRoomArea(!enabled);
        }
    }

    public void enableReservationArea(boolean enabled) {
        jbReservations.setEnabled(!enabled);
        this.reservationArea.setVisible(enabled);

        if (!jbGuests.isEnabled()) {
            jbGuests.setEnabled(true);
            enableGuestArea(!enabled);
        } else if (!jbAdmin.isEnabled()) {
            jbAdmin.setEnabled(true);
            enableAdminArea(!enabled);
        } else if (!jbRooms.isEnabled()) {
            jbRooms.setEnabled(true);
            enableRoomArea(!enabled);
        }
    }

    public void enableRoomArea(boolean enabled) {
        jbRooms.setEnabled(!enabled);
        this.roomsArea.setVisible(enabled);

        if (!jbGuests.isEnabled()) {
            jbGuests.setEnabled(true);
            enableGuestArea(!enabled);
        } else if (!jbAdmin.isEnabled()) {
            jbAdmin.setEnabled(true);
            enableAdminArea(!enabled);
        } else if (!jbReservations.isEnabled()) {
            jbReservations.setEnabled(true);
            enableReservationArea(!enabled);
        }
    }

    public void enableAdminArea(boolean enabled) {
        jbAdmin.setEnabled(!enabled);
        this.adminArea.setVisible(enabled);

        if (!jbGuests.isEnabled()) {
            jbGuests.setEnabled(true);
            enableGuestArea(!enabled);
        } else if (!jbRooms.isEnabled()) {
            jbRooms.setEnabled(true);
            enableRoomArea(!enabled);
        } else if (!jbReservations.isEnabled()) {
            jbReservations.setEnabled(true);
            enableReservationArea(!enabled);
        }
    }

    public void showPopupWindow(JFrame window, JButton button) {
        window.setVisible(true);
        button.setEnabled(false);

        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                button.setEnabled(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReservationButton;
    private javax.swing.JButton addRoomButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JPanel adminArea;
    private javax.swing.JScrollPane adminTableScroll;
    private javax.swing.JPanel backgroundArea;
    private javax.swing.JButton deleteGuestButton;
    private javax.swing.JButton deleteReservationButton;
    private javax.swing.JButton deleteRoomButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editGuestButton;
    private javax.swing.JButton editReservationButton;
    private javax.swing.JButton editRoomButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTable guestTable;
    private javax.swing.JScrollPane guestTableScroll;
    private javax.swing.JLabel guestTitleLabel;
    private javax.swing.JPanel guestsArea;
    private javax.swing.JPanel homePagePanel;
    private javax.swing.JPanel homePageWelcome;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLogo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAdmin;
    private javax.swing.JButton jbGuests;
    private javax.swing.JButton jbReservations;
    private javax.swing.JButton jbRooms;
    private javax.swing.JButton jbSearchGuest;
    private javax.swing.JButton jbSearchReservation;
    private javax.swing.JButton jbSearchRooms;
    private javax.swing.JButton jbUserReservation;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlTodayDate;
    private javax.swing.JLabel jlWelcomeTitle;
    private javax.swing.JTextField jtfSearchGuest;
    private javax.swing.JTextField jtfSearchReservation;
    private javax.swing.JTextField jtfSearchRooms;
    private javax.swing.JTextField jtfUserReservation;
    private javax.swing.JButton newGuestButton;
    private javax.swing.JPanel reservationArea;
    private javax.swing.JScrollPane reservationTableScroll;
    private javax.swing.JLabel reservationTitleLabel;
    private javax.swing.JTable reservationsTable;
    private javax.swing.JScrollPane roomTableScroll;
    private javax.swing.JPanel roomsArea;
    private javax.swing.JTable roomsTable;
    private javax.swing.JLabel roomsTitleLabel;
    private javax.swing.JLabel searchGuestLabel;
    private javax.swing.JLabel searchReservationLabel;
    private javax.swing.JLabel searchRoomsLabel;
    private javax.swing.JLabel searchUserLabel;
    private javax.swing.JLabel userTitleLabel;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
