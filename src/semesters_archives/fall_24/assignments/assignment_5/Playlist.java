/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.fall_24.assignments.assignment_5;

public class Playlist {
    public String name;

    private int songCount;
    private int playedSongCount;

    private PlayedSong firstPlayedSong;

    private Song firstSong;
    private Song lastSong;

    // TASK 2
    public Playlist(String playlistName) {
        this.name = playlistName;
        System.out.printf("%s created.\n", this.name);
    }

    // TASK 3
    public void addSong(Song newSong) {
        newSong.idx = this.songCount++;

        if (this.firstSong == null) {
            this.firstSong = this.lastSong = newSong;
        } else {
            this.lastSong.nextSong = this.lastSong = newSong;
        }

        newSong.playlist = this;
        System.out.printf("%s added to %s.\n", newSong.title, this.name);
    }

    // TASK 4
    public void info() {
        System.out.printf("%s has the following songs:\n", this.name);

        if (this.firstSong == null) {
            System.out.printf("No songs in %s.\n", this.name);
        } else {
            this.printSongInfo(this.firstSong);
        }
    }

    private void printSongInfo(Song iterativeSong) {
        System.out.printf("Song-%d\n", iterativeSong.idx + 1);
        iterativeSong.songInfo();

        Song nextSong = iterativeSong.nextSong;

        if (nextSong != null) {
            this.printSongInfo(nextSong);
        }
    }

    // TASK 5
    public void addSong(Song newSong, int idx) {
        if (idx >= 0 && idx <= this.songCount) {
            this.songCount++;

            if (idx == 0) {
                for (Song i = this.firstSong; i != null; i = i.nextSong) {
                    i.idx++;
                }

                newSong.idx = idx;
                newSong.nextSong = this.firstSong;
                this.firstSong = newSong;

            } else {
                Song current = firstSong;
                Song previous = null;

                while (current != null && current.idx < idx) {
                    previous = current;
                    current = current.nextSong;
                }

                if (previous != null) {
                    newSong.idx = idx;
                    newSong.nextSong = current;
                    previous.nextSong = newSong;

                    Song temp = newSong.nextSong;

                    while (temp != null) {
                        temp.idx++;
                        temp = temp.nextSong;
                    }
                }

                if (idx == this.songCount - 1) {
                    this.lastSong = newSong;
                }
            }

            newSong.playlist = this;
            System.out.printf("%s added to %s.\n", newSong.title, this.name);

        } else {
            System.out.printf("Cannot add song to Index %d.\n", idx);
        }
    }

    // TASK 6
    public void playSong(String songTitle) {
        boolean found = false;

        for (Song i = this.firstSong; i != null; i = i.nextSong) {
            if (i.title.equals(songTitle)) {
                System.out.printf("Playing %s by %s.\n", songTitle, i.artist);
                new PlayedSong(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("%s not found in playlist %s.\n", songTitle, this.name);
        }
    }

    // TASK 7
    public void playSong(int idx) {
        boolean found = false;

        for (Song i = this.firstSong; i != null; i = i.nextSong) {
            if (i.idx == idx) {
                System.out.printf("Playing %s by %s.\n", i.title, i.artist);
                new PlayedSong(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Song at Index %d not found in %s.\n", idx, this.name);
        }
    }

    // TASK 8
    public void deleteSong(String song) {
        int idx = -1;

        for (Song i = this.firstSong; i != null; i = i.nextSong) {
            if (i.title.equals(song)) {
                idx = i.idx;
                break;
            }
        }

        if (idx >= 0) {
            this.songCount--;

            if (idx == 0) {
                for (Song i = this.firstSong.nextSong; i != null; i = i.nextSong) {
                    i.idx--;
                }

                this.firstSong = this.firstSong.nextSong;

            } else {
                Song current = firstSong;
                Song previous = null;

                while (current != null && current.idx < idx) {
                    previous = current;
                    current = current.nextSong;
                }

                if (previous != null) {
                    previous.nextSong = current.nextSong;
                    Song temp = current;

                    while (temp != null) {
                        temp.idx--;
                        temp = temp.nextSong;
                    }
                }

                if (idx == this.songCount) {
                    this.lastSong = previous;
                }
            }

            System.out.printf("%s deleted from %s.\n", song, this.name);

        } else {
            System.out.printf("%s not found in %s.\n", song, this.name);
        }
    }

    // TASK 9
    public int totalSong() {
        return this.songCount;
    }

    // TASK 10
    public void merge(Playlist playlist) {
        for (Song i = playlist.firstSong; i != null; i = i.nextSong) {
            i.idx += this.lastSong.idx + 1;
            i.playlist = this;
        }

        this.lastSong.nextSong = playlist.firstSong;
        this.songCount += playlist.songCount;

        System.out.println("Merge Completed!");
    }

    // TASK 11
    private class PlayedSong extends Song {
        private PlayedSong nextPlayedSong;

        private PlayedSong(Song song) {
            super(song.title, song.artist, song.length);
            this.idx = playedSongCount++;

            if (firstPlayedSong == null) {
                firstPlayedSong = this;
            } else {
                PlayedSong current = firstPlayedSong;

                while (current.nextPlayedSong != null) {
                    current = current.nextPlayedSong;
                }

                current.nextPlayedSong = this;
            }
        }
    }

    public void showHistory() {
        System.out.printf("History of %s:\n", this.name);

        if (firstPlayedSong == null) {
            System.out.printf("No songs were played from %s.\n", this.name);
            return;
        }

        for (PlayedSong i = firstPlayedSong; i != null; i = i.nextPlayedSong) {
            i.songInfo();
        }
    }
}
